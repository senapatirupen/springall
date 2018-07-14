package com.exspring.demo;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.el.stream.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.exspring.demo.entity.Address;
import com.exspring.demo.entity.User;
import com.exspring.demo.repository.AddressRepository;
import com.exspring.demo.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void findAllAddress(){
		List<Address> addresses = addressRepository.findAll();
		System.out.println(addresses.size());
		assertNotNull(addresses);
		assertTrue(!addresses.isEmpty());
	}
	
	@Test
	public void createUser(){
		User user = new User();
		user.setName("Alok");
		user.setEmail("alok@outlook.com");
		User saveUser = userRepository.save(user);
		System.out.println(saveUser.getName());
		assertEquals("Alok", saveUser.getName());
	}

	@Test
	public void contextLoads() {
	}
 
}
