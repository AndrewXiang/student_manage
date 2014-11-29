package com.javaweb.ch11.student.serviceimp;

import java.util.List;

import com.javaweb.ch11.student.dao.SpecialDao;
import com.javaweb.ch11.student.daoimp.SpecialDaoImp;
import com.javaweb.ch11.student.model.SpecialTable;
import com.javaweb.ch11.student.service.SpecialService;


public class SpecialServiceImp implements SpecialService {
    SpecialDao zyDao=new SpecialDaoImp();
	//��������רҵ��Ϣ
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getAll()
	 */
	public List getAll()
	{
		return zyDao.getAll();
	}
	//����רҵID����רҵ��Ϣ
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getOneZy(java.lang.Integer)
	 */
	public SpecialTable getOneZy(Integer zyId)
	{
		return zyDao.getOneZy(zyId);
	}
	//���רҵ��Ϣ
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#save(chao.model.Zyb)
	 */
	public void save(SpecialTable zy)
	{
		zyDao.save(zy);
	}
}
