package com.exspring.demo.web.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exspring.demo.dto.PartyCount;
import com.exspring.demo.dto.VoteResult;
import com.exspring.demo.entity.Party;
import com.exspring.demo.entity.Poll;
import com.exspring.demo.entity.Vote;
import com.exspring.demo.repository.PartyRepository;
import com.exspring.demo.repository.PollRepository;
import com.exspring.demo.repository.VoteRepository;
import com.exspring.demo.web.exception.ResourceNotAvailableException;
import com.exspring.demo.web.exception.ResourceNotFoundException;

@RestController
public class PollController {

	@Inject
	private PollRepository pollRepository;

	@Inject
	private PartyRepository partyRepository;

	@Inject
	private VoteRepository voteRepository;

	@RequestMapping(value = "/polls", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Poll>> getAllPolls() {
		Iterable<Poll> allPolls = pollRepository.findAll();
		return new ResponseEntity<>(allPolls, HttpStatus.OK);
	}

	@RequestMapping(value = "/parties", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Party>> getAllParty() {
		Iterable<Party> allParties = partyRepository.findAll();
		return new ResponseEntity<>(allParties, HttpStatus.OK);
	}

	@RequestMapping(value = "/votes", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Vote>> getAllVotes() {
		Iterable<Vote> allVotes = voteRepository.findAll();
		return new ResponseEntity<>(allVotes, HttpStatus.OK);
	}

	@RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.GET)
	public Iterable<Vote> getAllVotes(@PathVariable Long pollId) {
		return voteRepository.findByPoll(pollId);
	}

	@RequestMapping(value = "/polls", method = RequestMethod.POST)
	public ResponseEntity<?> createPoll(@RequestBody Poll poll) {
		poll = pollRepository.save(poll);
		// Set the location header for the newly created resource
		HttpHeaders responseHeaders = new HttpHeaders();
		URI newPollUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(poll.getId())
				.toUri();
		responseHeaders.setLocation(newPollUri);
		return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
	public ResponseEntity<?> getPoll(@PathVariable Long pollId) throws ResourceNotFoundException {
		Optional<Poll> p = pollRepository.findById(pollId);
		if (!p.isPresent())
			throw new ResourceNotFoundException("Poll with id: " + pollId + " not found");
		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@RequestMapping(value = "/polls/{pollId}", method = RequestMethod.PUT)
	public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
		// Save the entity
		Poll p = pollRepository.save(poll);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/polls/{pollId}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePoll(@PathVariable Long pollId) throws ResourceNotAvailableException {
		Optional<Poll> p = pollRepository.findById(pollId);
		if (!p.isPresent())
			throw new ResourceNotAvailableException("Poll with id: " + pollId + " not found");
		pollRepository.deleteById(pollId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/polls/{pollId}/votes", method = RequestMethod.POST)
	public ResponseEntity<?> createVote(@PathVariable Long pollId, @RequestBody Vote vote) {
		vote = voteRepository.save(vote);
		// Set the headers for the newly created resource
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setLocation(
				ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(vote.getId()).toUri());
		return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/computeresult", method = RequestMethod.GET)
	public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
		VoteResult voteResult = new VoteResult();
		Iterable<Vote> allVote = voteRepository.findByPoll(pollId);
		// algorithm to count vote
		int totalVotes = 0;
		Map<Long, PartyCount> tempMap = new HashMap<Long, PartyCount>();
		for (Vote v : allVote) {
			totalVotes++;
			// Get the PartyCount corresponding to Party
			PartyCount partyCount = tempMap.get(v.getParty().getId());
			if (partyCount == null) {
				partyCount = new PartyCount();
				partyCount.setPartyId(v.getParty().getId());
				tempMap.put(v.getParty().getId(), partyCount);
			}
			voteResult.setTotalVotes(totalVotes);
			voteResult.setResults(tempMap.values());
		}
		System.out.println(allVote.iterator().next().getId());
		return new ResponseEntity<>(voteResult, HttpStatus.OK);
	}
}
