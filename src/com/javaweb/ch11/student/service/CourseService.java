package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;


public interface CourseService {

	//���ݿγ̺Ų�ѯ
	public abstract CourseTable find(String kch);

	//��ҳ��ʾ�γ���Ϣ
	public abstract List FindAll(int pageNow, int pageSize);

	//��ѯһ���������γ̼�¼
	public abstract int findKcSize();

	//��ӿγ���Ϣ
	public abstract void save(CourseTable kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(CourseTable kc);

}