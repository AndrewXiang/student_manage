package com.javaweb.ch11.student.service;

import com.javaweb.ch11.student.model.LoginTable;

public interface LoginService {

	//�Ƿ���ڸ�ѧ�ŵ��û�
	public abstract boolean existXh(String xh);

	//����ѧ�źͿ������
	public abstract LoginTable find(String xh, String kl);

	//����û�
	public abstract void save(LoginTable user);

}