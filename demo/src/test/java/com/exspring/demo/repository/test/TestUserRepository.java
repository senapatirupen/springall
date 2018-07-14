package com.exspring.demo.repository.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.exspring.demo.entity.User;
import com.exspring.demo.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TestUserRepository {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void save() {
		User user = createUser();
		userRepository.save(user);
		Assert.assertNotEquals(user.getId(), new Long(2));

	}
	
	@Test
	public void get() {
		User user = new User();
		user = userRepository.getOne(1L);
		Assert.assertEquals(user.getId(), new Long(1));

	}

	private User createUser() {
		User user = new User();
		user.setName("Alok");
		user.setEmail("alok@gmail.com");
		user.setMobileNumber("8147713016");
		user.setPassword("pass123");
		user.setRePassword("pass123");
		return user;
	}
}
