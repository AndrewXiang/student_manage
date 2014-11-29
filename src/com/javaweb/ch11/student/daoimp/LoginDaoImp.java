package com.javaweb.ch11.student.daoimp;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.javaweb.ch11.student.dao.LoginDao;
import com.javaweb.ch11.student.model.LoginTable;
import com.javaweb.ch11.student.util.HibernateSessionFactory;
//ʵ�����ݿ��
public class LoginDaoImp implements LoginDao {
	// �ж�ѧ���Ƿ����
    public boolean existXh(String xh)
    {
    	boolean b=false;
    	Session session=null;
    	try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Dlb where xh=?"+xh);
			LoginTable dl=(LoginTable) query.uniqueResult();
			if(dl!=null)
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    	return b;
    }
    //����ѧ�źͿ����ѯ���ݿ�
    public LoginTable find(String xh,String kl)
    {
    	LoginTable dl=null;
    	Session session=null;
    	try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from LoginTable where xh='"+xh+"'"+"and kl='"+kl+"'");
			dl=(LoginTable) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
        return dl;
    }
    //�����û���Ϣ
    public void save(LoginTable user)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(user);
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
