package com.javaweb.ch11.student.serviceimp;
import com.javaweb.ch11.student.dao.LoginDao;
import com.javaweb.ch11.student.daoimp.LoginDaoImp;
import com.javaweb.ch11.student.model.LoginTable;
import com.javaweb.ch11.student.service.LoginService;
public class LoginServiceImp implements LoginService {
    //调用DAO层实现数据库的操作
	LoginDao dlDao=new LoginDaoImp();
	//是否存在该学号的用户
	public boolean existXh(String xh)
	{
		return dlDao.existXh(xh);
	}
	//根据学号和口令查找
    public LoginTable find(String xh,String kl)
    {
    	return dlDao.find(xh, kl);
    }
    //添加用户
    public void save(LoginTable user)
    {
    	dlDao.save(user);
    }
}
