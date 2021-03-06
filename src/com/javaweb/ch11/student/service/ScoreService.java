package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.StudentTable;


public interface ScoreService {

	//根据学生和课程删除学生成绩
	public abstract void deleteCj(String xh,String kch);

	//删除某门课程的成绩
	public abstract void deleteOneKcInfo(String kch);

	//删除某学生的成绩
	public abstract void deleteOneXsCj(String xh);

	//分页显示所有学生成绩
	public abstract List findAllCj(int pageNow, int pageSize);

	//查询一共多少条成绩记录
	public abstract int findCjSize();

	//查询某门课程的学生成绩
	public abstract List getKcCjList(String kch);

	//根据学生和课程来查询学生成绩
	public abstract ScoreTable getXsCj(String xh,String kch);

	//查询某学生的学生成绩
	public abstract List getXsCjList(String xh);

	//添加或更新学生成绩	
	public abstract void save(ScoreTable cj);
	
	public abstract void update(ScoreTable cj);

}