package com.exspring.demo.service;

import com.exspring.demo.entity.SignUp;

public interface SignUpService {
	Boolean save(SignUp signUp);
	Boolean update(SignUp singUp);
	SignUp find(SignUp singUp);
	Boolean delete(SignUp signUp);
	Boolean signIn(SignUp singUp);
	Boolean resetPassword(SignUp signUp);
}
