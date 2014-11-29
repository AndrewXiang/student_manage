package com.javaweb.ch11.student.dao;

import com.javaweb.ch11.student.model.LoginTable;

public interface LoginDao {

	public abstract boolean existXh(String xh);

	public abstract LoginTable find(String xh, String kl);

	public abstract void save(LoginTable user);

}