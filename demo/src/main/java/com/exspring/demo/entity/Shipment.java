package com.exspring.demo.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SHIPMENT", schema = "demo")
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Column(name = "START_DATE", nullable = false, unique = false)
	private Date startDate;
	@Column(name = "IS_DELEVERED", nullable = false, unique = false)
	private String isDelevered;
	@Column(name = "DELIVER_DATE", nullable = false, unique = false)
	private Date deliverDate;
	@Column(name = "EXPECTED_DELIVERY_DATE", nullable = false, unique = false)
	private Date expectedDeliveryDate;
	@OneToMany(targetEntity = ShipmentAddress.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "SHIPMENT_SHIPMENTADDRESS", joinColumns = {
			@JoinColumn(name = "SHID", nullable = false, insertable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "SHADID", nullable = false, insertable = false, updatable = false) })
	private Collection<ShipmentAddress> shipmentAddressList;
	@OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "SHIPMENT_ORDER", joinColumns = {
			@JoinColumn(name = "SHID", nullable = false, insertable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ODID", nullable = false, insertable = false, updatable = false) })
	private Collection<Order> orderList;
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
	 * @return the shipmentAddressList
	 */
	public Collection<ShipmentAddress> getShipmentAddressList() {
		return shipmentAddressList;
	}

	/**
	 * @param shipmentAddressList
	 *            the shipmentAddressList to set
	 */
	public void setShipmentAddressList(Collection<ShipmentAddress> shipmentAddressList) {
		this.shipmentAddressList = shipmentAddressList;
	}

	/**
	 * @return the orderList
	 */
	public Collection<Order> getOrderList() {
		return orderList;
	}

	/**
	 * @param orderList
	 *            the orderList to set
	 */
	public void setOrderList(Collection<Order> orderList) {
		this.orderList = orderList;
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
