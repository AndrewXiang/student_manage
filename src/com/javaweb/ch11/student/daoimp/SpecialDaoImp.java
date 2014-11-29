package com.javaweb.ch11.student.daoimp;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaweb.ch11.student.dao.SpecialDao;
import com.javaweb.ch11.student.model.SpecialTable;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.util.HibernateSessionFactory;

public class SpecialDaoImp implements SpecialDao {
    public List getAll()
    {
    	List list=null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from SpecialTable");
			list = query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }
    public SpecialTable getOneZy(Integer zyId)
    {
    	SpecialTable zy=null;
		Session session=null;
		try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from SpecialTable where id='"+zyId+"'");
			zy=(SpecialTable) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return zy;
    }
    public void save(SpecialTable zy)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(zy);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    }
}
