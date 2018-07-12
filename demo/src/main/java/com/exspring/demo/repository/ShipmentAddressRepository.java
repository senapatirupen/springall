package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.ShipmentAddress;
@Repository
public interface ShipmentAddressRepository extends JpaRepository<ShipmentAddress, Long>{

}
