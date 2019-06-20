package com.exspring.demo.dto;

import java.util.Collection;

public class VoteResult {

	private int totalVotes;
	private Collection<PartyCount> results;
	/**
	 * @return the totalVotes
	 */
	public int getTotalVotes() {
		return totalVotes;
	}
	/**
	 * @param totalVotes the totalVotes to set
	 */
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	/**
	 * @return the results
	 */
	public Collection<PartyCount> getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(Collection<PartyCount> results) {
		this.results = results;
	}
	
	
}
