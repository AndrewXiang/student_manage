package com.javaweb.ch11.student.serviceimp;

import java.util.List;

import com.javaweb.ch11.student.dao.ScoreDao;
import com.javaweb.ch11.student.daoimp.ScoreDaoImp;
import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.service.ScoreService;


public class ScoreServiceImp implements ScoreService {
    ScoreDao cjDao=new ScoreDaoImp();
	//����ѧ���Ϳγ�ɾ��ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public void deleteCj(String xh,String kch)
    {
    	cjDao.deleteCj(xh, kch);
    }
    //ɾ��ĳ�ſγ̵ĳɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneKcInfo(java.lang.String)
	 */
    public void deleteOneKcInfo(String kch)
    {
    	cjDao.deleteOneKcInfo(kch);
    }
    //ɾ��ĳѧ���ĳɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneXsCj(java.lang.String)
	 */
    public void deleteOneXsCj(String xh)
    {
    	cjDao.deleteOneXsCj(xh);
    }
    //��ҳ��ʾ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findAll(int, int)
	 */
    public List findAllCj(int pageNow,int pageSize)
    {
    	return cjDao.findAllCj(pageNow, pageSize);
    }
    //��ѯһ���������ɼ���¼
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findCjSize()
	 */
    public int findCjSize()
    {
    	return cjDao.findCjSize();
    }
    //��ѯĳ�ſγ̵�ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getKcCjList(java.lang.String)
	 */
    public List getKcCjList(String kch)
    {
    	return cjDao.getKcCjList(kch);
    }
    //����ѧ���Ϳγ�����ѯѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public ScoreTable getXsCj(String xh,String kch)
    {
    	return cjDao.getXsCj(xh, kch);
    }
    //��ѯĳѧ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCjList(java.lang.String)
	 */
    public List getXsCjList(String xh)
    {
    	return cjDao.getXsCjList(xh);
    }
    //��ӻ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#saveorupdate(chao.model.Cjb)
	 */
    public void save(ScoreTable cj)
    {
    	cjDao.save(cj);
    }
    public void update(ScoreTable cj)
    {
    	cjDao.update(cj);
    }
}
