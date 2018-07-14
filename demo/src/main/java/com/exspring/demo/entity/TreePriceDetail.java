package com.exspring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TREE_PRICE_DETAIL", schema = "demo")
public class TreePriceDetail {

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

}
