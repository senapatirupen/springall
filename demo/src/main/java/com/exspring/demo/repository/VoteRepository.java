package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Vote;
@Repository
public interface VoteRepository extends CrudRepository<Vote, Long>{

	@Query(value="select v.* from Party p, Vote v where p.PARTY_ID=?1 and v.PARTY_ID = p.PARTY_ID", nativeQuery=true)
	public Iterable<Vote> findByPoll(Long pollId);
}
