package com.exspring.demo.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.exspring.demo.entity.SignUp;
import com.exspring.demo.repository.SignUpRepository;
import com.exspring.demo.util.ServiceUtil;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	SignUpRepository signUpRepository;

	@Override
	public Boolean save(SignUp signUp) {
		signUp.setCreatedBy("system");
		signUp.setModifiedBy("system");
		signUp.setCreatedDate(new Date());
		signUp.setModifiedDate(new Date());
		signUp.setPassword(new ServiceUtil().encodeString(signUp.getPassword()));
		signUpRepository.save(signUp);
		return true;
	}

	@Override
	public Boolean update(SignUp signUp) {
		signUpRepository.save(signUp);
		return true;
	}

	@Override
	public SignUp find(SignUp signUp) {
		Example<SignUp> exSignUp = Example.of(signUp);
		Optional<SignUp> opSignUp = signUpRepository.findOne(exSignUp);
		return opSignUp.get();
	}

	@Override
	public Boolean delete(SignUp signUp) {
		signUpRepository.delete(signUp);
		return true;
	}

	@Override
	public Boolean signIn(SignUp signUp) {
		SignUp signUpEntity = signUpRepository.findByEmailId(signUp.getEmailId()).get(0);
		String password = new ServiceUtil().decodeString(signUpEntity.getPassword());
		if(signUp.getEmailId().equalsIgnoreCase(signUpEntity.getEmailId()) && password.equalsIgnoreCase(signUp.getPassword()))
			return true;
		return false;
	}
	
	@Override
	public Boolean resetPassword(SignUp signUp) {
		SignUp signUpEntity = signUpRepository.findByEmailId(signUp.getEmailId()).get(0);
		String password = new ServiceUtil().decodeString(signUpEntity.getPassword());
		if(signUp.getEmailId().equalsIgnoreCase(signUpEntity.getEmailId()) && password.equalsIgnoreCase(signUp.getPassword())){
			signUpEntity.setPassword(new ServiceUtil().encodeString(signUp.getShortDesc()));
			signUpRepository.save(signUpEntity);
			return true;
		}
		return false;
	}
}
