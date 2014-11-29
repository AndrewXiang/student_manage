package com.javaweb.ch11.student.daoimp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaweb.ch11.student.dao.StudentDao;
import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.util.HibernateSessionFactory;


public class StudentDaoImp implements StudentDao {

    
	public void delete(String xh)
    {
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		Query query=session.createQuery("from StudentTable where xh='"+xh+"'");
    		StudentTable xs=(StudentTable) query.uniqueResult();
    		session.delete(xs);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
			   session.close();
		}
    }
    public StudentTable find(String xh)
    {
    	StudentTable xs=null;
		Session session=null;
		try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from StudentTable where xh='"+xh+"'");
			xs=(StudentTable) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return xs;
    }
    public List findAll(int pageNow,int pageSize)
    {
    	
    	List list=null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from StudentTable order by xh");
			int firstResult = (pageNow - 1) * pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			list = query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return list;
    }
    public int findXsSize()
    {
    	int size=0;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from StudentTable");
			List list= query.list();
			size=list.size();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return size;
    }
    public void save(StudentTable xs)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(xs);
    		ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
    }
    public void update(StudentTable xs)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.update(xs);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
    }
}
