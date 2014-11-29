package com.javaweb.ch11.student.model;
/**
 * Cjb entity. @author MyEclipse Persistence Tools
 */

public class ScoreTable implements java.io.Serializable {

	// Fields

	private ScoreTableID id;
	private Float cj;
	private Integer xf;

	// Constructors

	/** default constructor */
	public ScoreTable() {
	}

	/** minimal constructor */
	public ScoreTable(ScoreTableID id) {
		this.id = id;
	}

	/** full constructor */
	public ScoreTable(ScoreTableID id, Float cj, Integer xf) {
		this.id = id;
		this.cj = cj;
		this.xf = xf;
	}

	// Property accessors

	public ScoreTableID getId() {
		return this.id;
	}

	public void setId(ScoreTableID id) {
		this.id = id;
	}

	public Float getCj() {
		return this.cj;
	}

	public void setCj(Float cj) {
		this.cj = cj;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

}