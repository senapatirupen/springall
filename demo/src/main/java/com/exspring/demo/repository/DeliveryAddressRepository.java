package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.DeliveryAddress;
@Repository
public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Long>{

}
