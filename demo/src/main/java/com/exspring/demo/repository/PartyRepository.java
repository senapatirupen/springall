package com.exspring.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Party;
@Repository
public interface PartyRepository extends CrudRepository<Party, Long>{

}
