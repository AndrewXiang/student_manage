package com.javaweb.ch11.student.serviceimp;

import java.util.List;

import com.javaweb.ch11.student.dao.SpecialDao;
import com.javaweb.ch11.student.daoimp.SpecialDaoImp;
import com.javaweb.ch11.student.model.SpecialTable;
import com.javaweb.ch11.student.service.SpecialService;


public class SpecialServiceImp implements SpecialService {
    SpecialDao zyDao=new SpecialDaoImp();
	//查找所有专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getAll()
	 */
	public List getAll()
	{
		return zyDao.getAll();
	}
	//根据专业ID查找专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getOneZy(java.lang.Integer)
	 */
	public SpecialTable getOneZy(Integer zyId)
	{
		return zyDao.getOneZy(zyId);
	}
	//添加专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#save(chao.model.Zyb)
	 */
	public void save(SpecialTable zy)
	{
		zyDao.save(zy);
	}
}
