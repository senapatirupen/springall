package com.exspring.demo.builder;

import com.exspring.demo.entity.WishList;

public class WishListBuilder {

	private static WishListBuilder instance = new WishListBuilder();
	private String id = "";
	private String shortDesc = "";
	
	private WishListBuilder(){
	}
	
	public static WishListBuilder create(){
		return instance;
	}
	
	public WishListBuilder withDescription(String shortDesc){
		this.shortDesc = shortDesc;
		return instance;
	}
	
	public WishListBuilder withId(String id){
		this.id = id;
		return instance;
	}
	
	public WishList build(){
		WishList wishList = new WishList(this.shortDesc);
		if(id != null){
			wishList.setId(id);
		}
		return wishList;
	}
	
	
}
