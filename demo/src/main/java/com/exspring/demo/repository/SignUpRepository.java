package com.exspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.SignUp;
@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Long>{

}
