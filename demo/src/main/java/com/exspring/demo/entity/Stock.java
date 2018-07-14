package com.exspring.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "STOCK", schema = "demo")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Column(name = "NAME", nullable = false, unique = false)
	private String name;
	@Column(name = "START_DATE", nullable = true, unique = false)
	private Date startDate;
	@Column(name = "IS_AVAILABLE", nullable = false, unique = false)
	private Boolean isAvailable;
	@Column(name = "QUANTITY", nullable = false, unique = false)
	private String quantity;
	@Column(name = "EXPECTED_FINISH_DATE", nullable = true, unique = false)
	private Date expectedFinishDate;
	@Column(name = "EXPECTED_IN_STOCK_DATE", nullable = true, unique = false)
	private Date expectedInStockDate;
	@Column(name = "IN_STOCK_DURATION", nullable = true, unique = false)
	private Date inStockDuration;
	@Column(name = "QUANTITY_CONSUMPTION_PER_DATE", nullable = true, unique = false)
	private String quantityConsumptionPerDate;
	@Column(name = "CREATED_DATE", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column(name = "MODIFIED_DATE", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	@Column(name = "CREATED_BY", nullable = false, unique = false)
	private Boolean createdBy;
	@Column(name = "MODIFIED_BY", nullable = false, unique = false)
	private Boolean modifiedBy;

	/**
	 * @return the createdBy
	 */
	public Boolean getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(Boolean createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedBy
	 */
	public Boolean getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(Boolean modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "IS_ACTIVE", nullable = false, unique = false)
	private Boolean isActive;
	@Column(name = "IS_INACTIVE", nullable = false, unique = false)
	private Boolean isInactive;
	@Column(name = "SHORT_DESC", nullable = false, unique = false)
	private String shortDesc;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the isAvailable
	 */
	public Boolean getIsAvailable() {
		return isAvailable;
	}

	/**
	 * @param isAvailable
	 *            the isAvailable to set
	 */
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the expectedFinishDate
	 */
	public Date getExpectedFinishDate() {
		return expectedFinishDate;
	}

	/**
	 * @param expectedFinishDate
	 *            the expectedFinishDate to set
	 */
	public void setExpectedFinishDate(Date expectedFinishDate) {
		this.expectedFinishDate = expectedFinishDate;
	}

	/**
	 * @return the expectedInStockDate
	 */
	public Date getExpectedInStockDate() {
		return expectedInStockDate;
	}

	/**
	 * @param expectedInStockDate
	 *            the expectedInStockDate to set
	 */
	public void setExpectedInStockDate(Date expectedInStockDate) {
		this.expectedInStockDate = expectedInStockDate;
	}

	/**
	 * @return the inStockDuration
	 */
	public Date getInStockDuration() {
		return inStockDuration;
	}

	/**
	 * @param inStockDuration
	 *            the inStockDuration to set
	 */
	public void setInStockDuration(Date inStockDuration) {
		this.inStockDuration = inStockDuration;
	}

	/**
	 * @return the quantityConsumptionPerDate
	 */
	public String getQuantityConsumptionPerDate() {
		return quantityConsumptionPerDate;
	}

	/**
	 * @param quantityConsumptionPerDate
	 *            the quantityConsumptionPerDate to set
	 */
	public void setQuantityConsumptionPerDate(String quantityConsumptionPerDate) {
		this.quantityConsumptionPerDate = quantityConsumptionPerDate;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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
