package com.exspring.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="TREE_INFO", schema="netheart")
public class TreeInfo {

	/**
	 *
	 */
	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator", name="TableIdGen", parameters={
			@Parameter(name="table_name", value="TRINID_GENERATE"),
			@Parameter(name = "segment_value", value = "trdeId"),
            @Parameter(name = "optimizer", value = "pooled"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "10")
	})

	private Integer trinId;
	private String name;

	public Integer getTrinId() {
		return trinId;
	}
	public void setTrinId(Integer trinId) {
		this.trinId = trinId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
