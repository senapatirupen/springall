package com.exspring.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Poll;
@Repository
public interface PollRepository extends CrudRepository<Poll, Long>{

}
