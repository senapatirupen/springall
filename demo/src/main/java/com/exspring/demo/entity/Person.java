package com.exspring.demo.entity;

import java.util.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PERSON", schema = "demo")
public class Person {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "PEID_GENERATE"),
			@Parameter(name = "segment_value", value = "peId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "10") })
	private Long peId;
	@Column(name = "FIRST_NAME", nullable = false, unique = false)
	private String firstName;
	@Column(name = "MIDDLE_NAME", nullable = false, unique = false)
	private String middleName;
	@Column(name = "LAST_NAME", nullable = false, unique = false)
	private String lastName;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "SIID")
	private SignUp signUp;
	@OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "PERSON_ORDER", joinColumns = {
			@JoinColumn(name = "PEID", nullable = false, insertable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ODID", nullable = false, insertable = false, updatable = false) })
	private Collection<Order> orderList;
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "PERSON_ADDRESS", joinColumns = {
			@JoinColumn(name = "PEID", nullable = false, insertable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ADID", nullable = false, insertable = false, updatable = false) })
	private Collection<Address> addressList;
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "PERSON_DELIVERY_ADDRESS", joinColumns = {
			@JoinColumn(name = "PEID", nullable = false, insertable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "DEADID", nullable = false, insertable = false, updatable = false) })
	private Collection<DeliveryAddress> deliveryAddressList;
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
	 * @return the peId
	 */
	public Long getPeId() {
		return peId;
	}

	/**
	 * @param peId
	 *            the peId to set
	 */
	public void setPeid(Long peId) {
		this.peId = peId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the signUp
	 */
	public SignUp getSignUp() {
		return signUp;
	}

	/**
	 * @param signUp
	 *            the signUp to set
	 */
	public void setSignUp(SignUp signUp) {
		this.signUp = signUp;
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
	 * @return the addressList
	 */
	public Collection<Address> getAddressList() {
		return addressList;
	}

	/**
	 * @param addressList
	 *            the addressList to set
	 */
	public void setAddressList(Collection<Address> addressList) {
		this.addressList = addressList;
	}

	/**
	 * @return the deliveryAddressList
	 */
	public Collection<DeliveryAddress> getDeliveryAddressList() {
		return deliveryAddressList;
	}

	/**
	 * @param deliveryAddressList
	 *            the deliveryAddressList to set
	 */
	public void setDeliveryAddressList(Collection<DeliveryAddress> deliveryAddressList) {
		this.deliveryAddressList = deliveryAddressList;
	}

	/**
	 * @param peId
	 *            the peId to set
	 */
	public void setPeId(Long peId) {
		this.peId = peId;
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
