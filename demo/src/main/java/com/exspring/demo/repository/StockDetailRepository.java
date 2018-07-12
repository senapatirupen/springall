package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.StockDetail;
@Repository
public interface StockDetailRepository extends JpaRepository<StockDetail, Long>{

}
