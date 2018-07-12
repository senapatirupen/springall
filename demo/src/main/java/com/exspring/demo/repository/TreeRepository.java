package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Tree;
@Repository
public interface TreeRepository extends JpaRepository<Tree, Long>{

}
