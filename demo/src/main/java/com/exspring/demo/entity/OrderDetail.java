package com.exspring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "ORDER_DETAIL", schema = "demo")
public class OrderDetail {

	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "ODDEID_GENERATE"),
			@Parameter(name = "segment_value", value = "oddeId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "10") })
	private Long oddeId;
	@Column(name = "NAME", nullable = false, unique = false)
	private String name;
	@Column(name = "QUANTITY", nullable = false, unique = false)
	private String quantity;
	@Column(name = "PRICE", nullable = false, unique = false)
	private String price;

	/**
	 * @return the oddeId
	 */
	public Long getOddeId() {
		return oddeId;
	}

	/**
	 * @param oddeId
	 *            the oddeId to set
	 */
	public void setOddeId(Long oddeId) {
		this.oddeId = oddeId;
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
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

}
