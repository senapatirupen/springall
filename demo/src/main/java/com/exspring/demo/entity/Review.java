package com.exspring.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Review {

	private String id;
	private String description;
	private LocalDateTime created;
	private LocalDateTime modified;
	private Boolean likeOrDislike;
	
	public Review(){
		
	}
	
	public Review(String description){
		this.description = description;
	}
	
	public Review(String description, Boolean likeOrDislike){
		this.description = description;
		this.likeOrDislike = likeOrDislike;
	}
	
}
