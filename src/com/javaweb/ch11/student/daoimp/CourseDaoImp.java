package com.javaweb.ch11.student.daoimp;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaweb.ch11.student.dao.CourseDao;
import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.util.HibernateSessionFactory;

public class CourseDaoImp implements CourseDao {

	public CourseTable find(String kch) 
	{
		CourseTable kc=null;
		Session session=null;
		try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from CourseTable where kch='"+kch+"'");
			kc=(CourseTable) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return kc;
	}
	public List findAll(int pageNow, int pageSize) 
	{
		List list=null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from CourseTable");
			int firstResult = (pageNow - 1) * pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
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
	public int findXsSize() {
		int size=0;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from CourseTable");
			List list= query.list();
			size=list.size();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return size;
	}
	public void save(CourseTable kc)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(kc);
    		ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	public void delete(String kch)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		Query query=session.createQuery("from CourseTable where kch='"+kch+"'");
			CourseTable kc=(CourseTable) query.uniqueResult();
    		session.delete(kc);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    }
	
	public void update(CourseTable kc)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.update(kc);
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
