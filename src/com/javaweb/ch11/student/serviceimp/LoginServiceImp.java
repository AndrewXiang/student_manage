package com.javaweb.ch11.student.serviceimp;
import com.javaweb.ch11.student.dao.LoginDao;
import com.javaweb.ch11.student.daoimp.LoginDaoImp;
import com.javaweb.ch11.student.model.LoginTable;
import com.javaweb.ch11.student.service.LoginService;
public class LoginServiceImp implements LoginService {
    //����DAO��ʵ�����ݿ�Ĳ���
	LoginDao dlDao=new LoginDaoImp();
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existXh(String xh)
	{
		return dlDao.existXh(xh);
	}
	//����ѧ�źͿ������
    public LoginTable find(String xh,String kl)
    {
    	return dlDao.find(xh, kl);
    }
    //����û�
    public void save(LoginTable user)
    {
    	dlDao.save(user);
    }
}
