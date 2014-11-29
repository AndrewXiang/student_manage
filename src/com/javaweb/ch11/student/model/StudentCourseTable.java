package com.javaweb.ch11.student.model;

/**
 * XsKcb entity. @author MyEclipse Persistence Tools
 */

public class StudentCourseTable implements java.io.Serializable {

	// Fields
//Download by http://www.codefans.net
	private StudentCourseTableID id;

	// Constructors

	/** default constructor */
	public StudentCourseTable() {
	}

	/** full constructor */
	public StudentCourseTable(StudentCourseTableID id) {
		this.id = id;
	}

	// Property accessors

	public StudentCourseTableID getId() {
		return this.id;
	}

	public void setId(StudentCourseTableID id) {
		this.id = id;
	}

}