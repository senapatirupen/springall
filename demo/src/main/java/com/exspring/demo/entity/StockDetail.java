package com.exspring.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STOCK_DETAIL", schema = "demo")
public class StockDetail {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "STDEID_GENERATE"),
			@Parameter(name = "segment_value", value = "stdeId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "10") })
	private Long stdeId;
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
	 * @return the stdeId
	 */
	public Long getStdeId() {
		return stdeId;
	}

	/**
	 * @param stdeId
	 *            the stdeId to set
	 */
	public void setStdeId(Long stdeId) {
		this.stdeId = stdeId;
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
