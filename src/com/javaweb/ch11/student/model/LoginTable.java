package com.javaweb.ch11.student.model;

/**
 * Dlb entity. @author MyEclipse Persistence Tools
 */

public class LoginTable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xh;
	private String kl;

	// Constructors

	/** default constructor */
	public LoginTable() {
	}

	/** full constructor */
	public LoginTable(String xh, String kl) {
		this.xh = xh;
		this.kl = kl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getKl() {
		return this.kl;
	}

	public void setKl(String kl) {
		this.kl = kl;
	}

}