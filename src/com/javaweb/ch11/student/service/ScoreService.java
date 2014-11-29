package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.StudentTable;


public interface ScoreService {

	//����ѧ���Ϳγ�ɾ��ѧ���ɼ�
	public abstract void deleteCj(String xh,String kch);

	//ɾ��ĳ�ſγ̵ĳɼ�
	public abstract void deleteOneKcInfo(String kch);

	//ɾ��ĳѧ���ĳɼ�
	public abstract void deleteOneXsCj(String xh);

	//��ҳ��ʾ����ѧ���ɼ�
	public abstract List findAllCj(int pageNow, int pageSize);

	//��ѯһ���������ɼ���¼
	public abstract int findCjSize();

	//��ѯĳ�ſγ̵�ѧ���ɼ�
	public abstract List getKcCjList(String kch);

	//����ѧ���Ϳγ�����ѯѧ���ɼ�
	public abstract ScoreTable getXsCj(String xh,String kch);

	//��ѯĳѧ����ѧ���ɼ�
	public abstract List getXsCjList(String xh);

	//��ӻ����ѧ���ɼ�	
	public abstract void save(ScoreTable cj);
	
	public abstract void update(ScoreTable cj);

}