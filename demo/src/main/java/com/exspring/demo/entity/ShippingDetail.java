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
@Table(name = "SHIPPING_DETAIL", schema = "demo")
public class ShippingDetail {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "SHDEID_GENERATE"),
			@Parameter(name = "segment_value", value = "shdeId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "10") })
	private Long shdeId;
	@Column(name = "IS_DELEVERED", nullable = false, unique = false)
	private String isDelevered;
	@Column(name = "DELIVER_DATE", nullable = false, unique = false)
	private Date deliverDate;
	@Column(name = "EXPECTED_DELIVERY_DATE", nullable = false, unique = false)
	private Date expectedDeliveryDate;
	@Column(name = "SHIPPING_ADDRESS", nullable = true, unique = false)
	private String shippingAddress;

	/**
	 * @return the shdeId
	 */
	public Long getShdeId() {
		return shdeId;
	}

	/**
	 * @param shdeId
	 *            the shdeId to set
	 */
	public void setShdeId(Long shdeId) {
		this.shdeId = shdeId;
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
