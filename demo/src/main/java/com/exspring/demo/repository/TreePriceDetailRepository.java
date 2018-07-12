package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.TreePriceDetail;
@Repository
public interface TreePriceDetailRepository extends JpaRepository<TreePriceDetail, Long>{

}
