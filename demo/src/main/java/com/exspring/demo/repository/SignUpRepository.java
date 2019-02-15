package com.exspring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.SignUp;
@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Long>{

	List<SignUp> findByEmailId(@Param("emailId") String emailId);
	List<SignUp> findByPassword(@Param("password") String password);
}
