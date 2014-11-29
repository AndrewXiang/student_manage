package com.javaweb.ch11.student.serviceimp;

import java.util.List;

import com.javaweb.ch11.student.dao.CourseDao;
import com.javaweb.ch11.student.daoimp.CourseDaoImp;
import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.service.CourseService;


public class CourseServiceImp implements CourseService {
    CourseDao kcDao=new CourseDaoImp(); 
	//���ݿγ̺Ų�ѯ
    public CourseTable find(String kch)
    {
    	return kcDao.find(kch);
    }
    //��ҳ��ʾ�γ���Ϣ
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#FindAll(int, int)
	 */
    public List FindAll(int pageNow,int pageSize)
    {
    	return kcDao.findAll(pageNow, pageSize);
    }
    //��ѯһ���������γ̼�¼
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#findKcSize()
	 */
    public int findKcSize()
    {
    	return kcDao.findXsSize();
    }
    //��ӿγ���Ϣ
    public void save(CourseTable kc)
    {
    	kcDao.save(kc);
    }
    public void delete(String kch)
    {
    	kcDao.delete(kch);
    }
    public void update(CourseTable kc)
    {
    	kcDao.update(kc);
    }
}
