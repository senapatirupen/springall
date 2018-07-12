package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.TreeDetail;
@Repository
public interface TreeDetailRepository extends JpaRepository<TreeDetail, Long>{

}
