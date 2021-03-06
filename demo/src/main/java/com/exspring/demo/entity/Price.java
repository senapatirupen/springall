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
@Table(name = "PRICE", schema = "demo")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Column(name = "PURCHASE_PRICE", nullable = false, unique = false)
	private String purchasePrice;
	@Column(name = "SALE_PRICE", nullable = false, unique = false)
	private String salePrice;
	@Column(name = "TAX", nullable = true, unique = false)
	private String tax;
	@Column(name = "PURCHASE_PERCENT", nullable = true, unique = false)
	private String purchasePercent;
	@Column(name = "SALE_PERCENT", nullable = true, unique = false)
	private String salePercent;
	@Column(name = "PROFIT", nullable = true, unique = false)
	private String profit;
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

	/**
	 * @param isInactive
	 *            the isInactive to set
	 */
	public void setIsInactive(Boolean isInactive) {
		this.isInactive = isInactive;
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
	 * @return the purchasePrice
	 */
	public String getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice
	 *            the purchasePrice to set
	 */
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the salePrice
	 */
	public String getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice
	 *            the salePrice to set
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @return the tax
	 */
	public String getTax() {
		return tax;
	}

	/**
	 * @param tax
	 *            the tax to set
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}

	/**
	 * @return the purchasePercent
	 */
	public String getPurchasePercent() {
		return purchasePercent;
	}

	/**
	 * @param purchasePercent
	 *            the purchasePercent to set
	 */
	public void setPurchasePercent(String purchasePercent) {
		this.purchasePercent = purchasePercent;
	}

	/**
	 * @return the salePercent
	 */
	public String getSalePercent() {
		return salePercent;
	}

	/**
	 * @param salePercent
	 *            the salePercent to set
	 */
	public void setSalePercent(String salePercent) {
		this.salePercent = salePercent;
	}

	/**
	 * @return the profit
	 */
	public String getProfit() {
		return profit;
	}

	/**
	 * @param profit
	 *            the profit to set
	 */
	public void setProfit(String profit) {
		this.profit = profit;
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
	public void setiIInactive(Boolean isInactive) {
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
