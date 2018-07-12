package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.ShippingDetail;
@Repository
public interface ShippingDetailRepository extends JpaRepository<ShippingDetail, Long>{

}
