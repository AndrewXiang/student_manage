package com.javaweb.ch11.student.service;

import java.util.List;

import com.javaweb.ch11.student.model.SpecialTable;


public interface SpecialService {

	//查找所有专业信息
	public abstract List getAll();

	//根据专业ID查找专业信息
	public abstract SpecialTable getOneZy(Integer zyId);

	//添加专业信息
	public abstract void save(SpecialTable zy);

}