package com.javaweb.ch11.student.dao;

import java.util.List;

import com.javaweb.ch11.student.model.SpecialTable;


public interface SpecialDao {

	public abstract List getAll();

	public abstract SpecialTable getOneZy(Integer zyId);

	public abstract void save(SpecialTable zy);

}