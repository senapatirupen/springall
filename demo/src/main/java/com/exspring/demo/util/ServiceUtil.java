package com.exspring.demo.util;

import java.util.Base64;

public class ServiceUtil {

	public String encodeString(String data){
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
	
	public String decodeString(String data){
		byte[] byteData = Base64.getDecoder().decode(data);
		return new String(byteData);
	}
}
