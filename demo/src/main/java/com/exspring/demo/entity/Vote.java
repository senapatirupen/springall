package com.exspring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "VOTE", schema = "demo")
public class Vote {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "VOTE_ID", updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	@OrderBy
	private Party party;
	
	

	/**
	 * @return the party
	 */
	public Party getParty() {
		return party;
	}

	/**
	 * @param party the party to set
	 */
	public void setParty(Party party) {
		this.party = party;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

}
