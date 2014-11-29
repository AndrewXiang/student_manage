package com.javaweb.ch11.student.dao;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;


public interface CourseDao {

	public abstract CourseTable find(String kch);

	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	public abstract void save(CourseTable kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(CourseTable kc);

}