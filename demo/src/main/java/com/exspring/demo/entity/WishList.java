package com.exspring.demo.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class WishList {

	@NotNull
	private String id;
	private List<String> productIds;
	@NotNull
	@NotBlank
	private String shortDesc;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
	public WishList(){
		LocalDateTime date = LocalDateTime.now();
		this.id = UUID.randomUUID().toString();
		this.createdDate = date;
		this.modifiedDate = date;
	}
	
	public WishList(String shortDesc){
		this();
		this.shortDesc = shortDesc;
	}
	
}
