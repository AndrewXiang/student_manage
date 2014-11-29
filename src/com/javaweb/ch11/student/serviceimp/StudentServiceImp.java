package com.javaweb.ch11.student.serviceimp;

import java.util.List;

import com.javaweb.ch11.student.dao.ScoreDao;
import com.javaweb.ch11.student.dao.StudentDao;
import com.javaweb.ch11.student.daoimp.ScoreDaoImp;
import com.javaweb.ch11.student.daoimp.StudentDaoImp;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.service.StudentService;


public class StudentServiceImp implements StudentService {
    StudentDao xsDao=new StudentDaoImp();
    ScoreDao cjDao=new ScoreDaoImp();
	/* (non-Javadoc)
	 * @see chao.serviceimp.XsService#delete(java.lang.String)
	 */
    public void delete(String xh)
    {
    	//ɾ��ѧ��ʱͬʱҪɾ����Ӧ�ɼ�
    	xsDao.delete(xh);
    }
    //ͨ��ѧ�Ž��в���
    public StudentTable find(String xh)
    {
    	return xsDao.find(xh);
    }
    //��������ѧ��
    public List findAll(int pageNow,int pageSize)
    {
    	return xsDao.findAll(pageNow, pageSize);
    }
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#findXsSize()
	 */
    public int findXsSize()
    {
    	return xsDao.findXsSize();
    }
    //���
    public void save(StudentTable xs)
    {
    	xsDao.save(xs);
    }
    //�޸�
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#update(chao.model.Xsb)
	 */
    public void update(StudentTable xs)
    {
    	xsDao.update(xs);
    }
}
