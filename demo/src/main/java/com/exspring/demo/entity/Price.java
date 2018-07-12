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
@Table(name = "PRICE", schema = "netheart")
public class Price {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "PRID_GENERATE"),
			@Parameter(name = "segment_value", value = "prId"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10") })
	private Long prId;
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
	@Column(name = "IS_ACTIVE", nullable = false, unique = false)
	private Boolean isActive;
	@Column(name = "IS_INACTIVE", nullable = false, unique = false)
	private Boolean isInactive;
	@Column(name = "SHORT_DESC", nullable = false, unique = false)
	private String shortDesc;

	/**
	 * @return the prId
	 */
	public Long getPrId() {
		return prId;
	}

	/**
	 * @param prId
	 *            the prId to set
	 */
	public void setPrId(Long prId) {
		this.prId = prId;
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
