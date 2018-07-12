package com.exspring.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "TREE_DETAIL", schema = "netheart")
public class TreeDetail {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "TRDEID_GENERATE"),
			@Parameter(name = "segment_value", value = "trdeId"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10") })
	private Long trdeId;
	@Column(nullable = false, unique = true, name = "NAME")
	private String name;
	@Column(nullable = false, unique = true, name = "COLOR")
	private String color;
	@Column(nullable = false, unique = true, name = "PETALS")
	private String petals;
	@Column(nullable = false, unique = true, name = "SCENT")
	private String scent;
	@Column(nullable = false, unique = true, name = "LIFE_SPAN")
	private String lifeSpan;
	@Column(nullable = false, unique = false, name = "TYPE")
	private String type;
	@Column(nullable = false, unique = true, name = "VARIETY")
	private String variety;
	@Column(nullable = false, unique = false, name = "HEIGHT")
	private String height;
	@Column(nullable = false, unique = true, name = "BUD_SIZE")
	private String budSize;
	@Column(name = "CREATED_DATE", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column(name = "MODIFIED_DATE", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	@Column(name = "IS_ACTIVE", nullable = false, unique = false)
	private Boolean isActive;
	@Column(name = "IS_INACTIVE", nullable = false, unique = false)
	private Boolean isInactive;
	@Column(name = "SHORT_DESC", nullable = false, unique = false)
	private String shortDesc;

	/**
	 * @return the trdeId
	 */
	public Long getTrdeId() {
		return trdeId;
	}

	/**
	 * @param trdeId
	 *            the trdeId to set
	 */
	public void setTrdeId(Long trdeId) {
		this.trdeId = trdeId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the petals
	 */
	public String getPetals() {
		return petals;
	}

	/**
	 * @param petals
	 *            the petals to set
	 */
	public void setPetals(String petals) {
		this.petals = petals;
	}

	/**
	 * @return the scent
	 */
	public String getScent() {
		return scent;
	}

	/**
	 * @param scent
	 *            the scent to set
	 */
	public void setScent(String scent) {
		this.scent = scent;
	}

	/**
	 * @return the lifeSpan
	 */
	public String getLifeSpan() {
		return lifeSpan;
	}

	/**
	 * @param lifeSpan
	 *            the lifeSpan to set
	 */
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the variety
	 */
	public String getVariety() {
		return variety;
	}

	/**
	 * @param variety
	 *            the variety to set
	 */
	public void setVariety(String variety) {
		this.variety = variety;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the budSize
	 */
	public String getBudSize() {
		return budSize;
	}

	/**
	 * @param budSize
	 *            the budSize to set
	 */
	public void setBudSize(String budSize) {
		this.budSize = budSize;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isInactive
	 */
	public Boolean getIsInactive() {
		return isInactive;
	}

	/**
	 * @param isInactive
	 *            the isInactive to set
	 */
	public void setIsInactive(Boolean isInactive) {
		this.isInactive = isInactive;
	}

	/**
	 * @return the shortDesc
	 */
	public String getShortDesc() {
		return shortDesc;
	}

	/**
	 * @param shortDesc
	 *            the shortDesc to set
	 */
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

}