package com.exspring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "USER", schema = "demo")
public class User {
	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "USID_GENERATE"),
			@Parameter(name = "segment_value", value = "usId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "10") })
	private Long usId;
	@Column(name = "NAME", nullable = false, unique = false)
	private String name;
	@Column(name = "EMAIL", nullable = false, unique = false)
	private String email;

	public String getName() {
		return name;
	}

	/**
	 * @return the usId
	 */
	public Long getUsId() {
		return usId;
	}

	/**
	 * @param usId
	 *            the usId to set
	 */
	public void setUsId(Long usId) {
		this.usId = usId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
