package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
