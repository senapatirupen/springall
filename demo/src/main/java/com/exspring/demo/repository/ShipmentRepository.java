package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.Shipment;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long>{

}
