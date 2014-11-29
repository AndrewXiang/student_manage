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
    	//删除学生时同时要删除对应成绩
    	xsDao.delete(xh);
    }
    //通过学号进行查找
    public StudentTable find(String xh)
    {
    	return xsDao.find(xh);
    }
    //查找所有学生
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
    //添加
    public void save(StudentTable xs)
    {
    	xsDao.save(xs);
    }
    //修改
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#update(chao.model.Xsb)
	 */
    public void update(StudentTable xs)
    {
    	xsDao.update(xs);
    }
}
