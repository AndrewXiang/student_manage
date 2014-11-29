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
    //����ѧ�Ų��ѧ�������������пγ̵Ŀγ̺š��γ���������ɼ���ѧ��

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
    //������гɼ���ѧ����ѧ�š����������ѧ�ּ���Ӧ�γ̺źͿγ���
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
	//ɾ�����з��Ͽγ̺ŵ�ѧ���ɼ�
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
	//ɾ�����з���ѧ�ŵ�ѧ���ɼ�
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
