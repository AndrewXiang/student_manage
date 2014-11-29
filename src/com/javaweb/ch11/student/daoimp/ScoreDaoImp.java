package com.javaweb.ch11.student.daoimp;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaweb.ch11.student.dao.ScoreDao;
import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.ScoreTableID;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.util.HibernateSessionFactory;

public class ScoreDaoImp implements ScoreDao {
	
    public ScoreTable getXsCj(String xh,String kch)
    {	
    	ScoreTable cj=null;
    	Session session = null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from ScoreTable where id.xsb.xh='"+xh+"'"+"and id.kcb.kch='"+kch+"'");
    		cj=(ScoreTable) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return cj;
    }
    //根据学号查出学生的姓名及所有课程的课程号、课程名、所获成绩和学分

    public List getKcCjList(String kch)
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from ScoreTable where id.kcb.kch='"+kch+"'");
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }

    public List getXsCjList(String xh)
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from ScoreTable where id.xsb.xh='"+xh+"'");
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }
    //查出所有成绩的学生的学号、姓名、获得学分及对应课程号和课程名
    public List findAllCj(int pageNow, int pageSize) 
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from ScoreTable");
    		int firstResult = (pageNow - 1) * pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
	}
    public int findCjSize() {
    	int size=0;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from ScoreTable");
    		List list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		finally{
			session.close();
		}
		return size;
	}
	public void deleteCj(String xh,String kch)
    {
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		Query query=session.createQuery("from ScoreTable where id.xsb.xh='"+xh+"'"+"and id.kcb.kch='"+kch+"'");
    		ScoreTable cj=(ScoreTable) query.uniqueResult();
    		session.delete(cj);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    }
	//删除所有符合课程号的学生成绩
	public void deleteOneKcInfo(String kch)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.delete(getKcCjList(kch));
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	//删除所有符合学号的学生成绩
	public void deleteOneXsCj(String xh)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.delete(getXsCjList(xh));
    		ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	public void save(ScoreTable cj)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(cj);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	public void update(ScoreTable cj)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.update(cj);
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
