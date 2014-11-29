package com.javaweb.ch11.student.dao;

import java.util.List;

import com.javaweb.ch11.student.model.StudentTable;


public interface StudentDao {

	public abstract void delete(String xh);

	public abstract StudentTable find(String xh);

	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	public abstract void save(StudentTable xs);

	public abstract void update(StudentTable xs);

}