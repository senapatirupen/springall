package com.exspring.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPPING_DETAIL", schema = "demo")
public class ShippingDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Column(name = "IS_DELEVERED", nullable = false, unique = false)
	private String isDelevered;
	@Column(name = "DELIVER_DATE", nullable = false, unique = false)
	private Date deliverDate;
	@Column(name = "EXPECTED_DELIVERY_DATE", nullable = false, unique = false)
	private Date expectedDeliveryDate;
	@Column(name = "SHIPPING_ADDRESS", nullable = true, unique = false)
	private String shippingAddress;

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
	 * @return the isDelevered
	 */
	public String getIsDelevered() {
		return isDelevered;
	}

	/**
	 * @param isDelevered
	 *            the isDelevered to set
	 */
	public void setIsDelevered(String isDelevered) {
		this.isDelevered = isDelevered;
	}

	/**
	 * @return the deliverDate
	 */
	public Date getDeliverDate() {
		return deliverDate;
	}

	/**
	 * @param deliverDate
	 *            the deliverDate to set
	 */
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	/**
	 * @return the expectedDeliveryDate
	 */
	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	/**
	 * @param expectedDeliveryDate
	 *            the expectedDeliveryDate to set
	 */
	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
