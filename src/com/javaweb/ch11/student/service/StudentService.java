package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.StudentTable;


public interface StudentService {

	public abstract void delete(String xh);

	//ͨ��ѧ�Ž��в���
	public abstract StudentTable find(String xh);

	//��������ѧ��
	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	//���
	public abstract void save(StudentTable xs);

	//�޸�
	public abstract void update(StudentTable xs);
	
}