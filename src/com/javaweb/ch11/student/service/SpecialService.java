package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.SpecialTable;


public interface SpecialService {

	//��������רҵ��Ϣ
	public abstract List getAll();

	//����רҵID����רҵ��Ϣ
	public abstract SpecialTable getOneZy(Integer zyId);

	//���רҵ��Ϣ
	public abstract void save(SpecialTable zy);

}