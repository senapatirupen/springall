package com.exspring.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "POLL", schema = "demo")
public class Poll {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "POLL_ID", updatable = false, nullable = false)
	private Long id;
	
	@Column(name="QUESTION")
	@NotEmpty
	private String question;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="POLL_ID")
	@OrderBy
	@Size(min=2, max=6)
	private Set<Party> parties;

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
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the parties
	 */
	public Set<Party> getParties() {
		return parties;
	}

	/**
	 * @param parties the parties to set
	 */
	public void setParties(Set<Party> parties) {
		this.parties = parties;
	}
	
}
