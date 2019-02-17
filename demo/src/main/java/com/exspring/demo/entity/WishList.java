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

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the productIds
	 */
	public List<String> getProductIds() {
		return productIds;
	}

	/**
	 * @param productIds the productIds to set
	 */
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}

	/**
	 * @return the shortDesc
	 */
	public String getShortDesc() {
		return shortDesc;
	}

	/**
	 * @param shortDesc the shortDesc to set
	 */
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
