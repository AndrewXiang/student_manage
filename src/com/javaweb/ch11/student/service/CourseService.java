package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;


public interface CourseService {

	//根据课程号查询
	public abstract CourseTable find(String kch);

	//分页显示课程信息
	public abstract List FindAll(int pageNow, int pageSize);

	//查询一共多少条课程记录
	public abstract int findKcSize();

	//添加课程信息
	public abstract void save(CourseTable kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(CourseTable kc);

}