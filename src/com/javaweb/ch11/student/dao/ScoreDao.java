package com.javaweb.ch11.student.dao;

import java.util.List;

import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.StudentTable;


public interface ScoreDao {

	public abstract ScoreTable getXsCj(String xh,String kch);

	//����ѧ�Ų��ѧ�������������пγ̵Ŀγ̺š��γ���������ɼ���ѧ��
	public abstract List getKcCjList(String kch);

	public abstract List getXsCjList(String xh);

	//������гɼ���ѧ����ѧ�š����������ѧ�ּ���Ӧ�γ̺źͿγ���
	public abstract List findAllCj(int pageNow, int pageSize);

	public abstract int findCjSize();

	public abstract void deleteCj(String xh,String kch);

	//ɾ�����з��Ͽγ̺ŵ�ѧ���ɼ�
	public abstract void deleteOneKcInfo(String kch);

	//ɾ�����з���ѧ�ŵ�ѧ���ɼ�
	public abstract void deleteOneXsCj(String xh);

	public abstract void save(ScoreTable cj);
	
	public abstract void update(ScoreTable cj);

}