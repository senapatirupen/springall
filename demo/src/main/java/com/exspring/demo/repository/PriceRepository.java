package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Price;
@Repository
public interface PriceRepository extends JpaRepository<Price, Long>{

}
