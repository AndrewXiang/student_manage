package com.javaweb.ch11.student.service;

import com.javaweb.ch11.student.model.LoginTable;

public interface LoginService {

	//是否存在该学号的用户
	public abstract boolean existXh(String xh);

	//根据学号和口令查找
	public abstract LoginTable find(String xh, String kl);

	//添加用户
	public abstract void save(LoginTable user);

}