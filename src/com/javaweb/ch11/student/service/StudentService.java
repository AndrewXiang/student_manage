package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.StudentTable;


public interface StudentService {

	public abstract void delete(String xh);

	//通过学号进行查找
	public abstract StudentTable find(String xh);

	//查找所有学生
	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	//添加
	public abstract void save(StudentTable xs);

	//修改
	public abstract void update(StudentTable xs);
	
}