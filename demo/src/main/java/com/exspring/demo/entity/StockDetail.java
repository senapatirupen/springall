package com.exspring.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_DETAIL", schema = "demo")
public class StockDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Column(name = "NAME", nullable = false, unique = false)
	private String name;
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

}
