package com.javaweb.ch11.student.action;

import java.util.List;
import java.util.Map;


import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.ScoreTable;
import com.javaweb.ch11.student.model.ScoreTableID;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.service.CourseService;
import com.javaweb.ch11.student.service.ScoreService;
import com.javaweb.ch11.student.service.StudentService;
import com.javaweb.ch11.student.serviceimp.CourseServiceImp;
import com.javaweb.ch11.student.serviceimp.ScoreServiceImp;
import com.javaweb.ch11.student.serviceimp.StudentServiceImp;
import com.javaweb.ch11.student.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScoreAction extends ActionSupport{
    private ScoreTable cj;
    private int pageNow=1;
	private int pageSize=8; 
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public ScoreTable getCj() {
		return cj;
	}
	public void setCj(ScoreTable cj) {
		this.cj = cj;
	}
	StudentService xsService=new StudentServiceImp();
    CourseService kcService=new CourseServiceImp();
    ScoreService cjService=new ScoreServiceImp();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List list1=xsService.findAll(1, xsService.findXsSize());
		List list2=kcService.FindAll(1, kcService.findKcSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list1", list1);
		request.put("list2", list2);
		return SUCCESS;
	}
	public String addCj() throws Exception {
		String xh=cj.getId().getXsb().getXh();
		String kch=cj.getId().getKcb().getKch();
		if(cjService.getXsCj(xh, kch)!=null)
		{
			return ERROR;
		}
		ScoreTable cj1=new ScoreTable();
		ScoreTableID cjId=new ScoreTableID();
		cjId.setXsb(cj.getId().getXsb());
		cjId.setKcb(cj.getId().getKcb());
		cj1.setId(cjId);
		cj1.setCj(cj.getCj());
		CourseTable kc1=kcService.find(cj.getId().getKcb().getKch());
		if(cj.getCj()>60||cj.getCj()==60)
		{
			cj1.setXf(kc1.getXf());
		}
		else
			cj1.setXf(0);
		cjService.save(cj1);
		return SUCCESS;
	}
	public String xscjInfo() throws Exception {
		List list=cjService.findAllCj(pageNow, pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		Pager page=new Pager(pageNow, cjService.findCjSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public String findXscj() throws Exception {
		List list=cjService.getXsCjList(cj.getId().getXsb().getXh());
		if(list.size()>0)
		{
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("list", list);
			return SUCCESS;
		}
		else
			return ERROR;
	}
	public String findCj() throws Exception {
		ScoreTable stucj=cjService.getXsCj(cj.getId().getXsb().getXh(),cj.getId().getKcb().getKch());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("stucj", stucj);
		return SUCCESS;
	}
	public String deleteCj() throws Exception {
		String xh=cj.getId().getXsb().getXh();
		String kch=cj.getId().getKcb().getKch();
        cjService.deleteCj(xh, kch);
		return SUCCESS;
	}
	public String updateCjView() throws Exception {
		ScoreTable cjInfo=cjService.getXsCj(cj.getId().getXsb().getXh(),cj.getId().getKcb().getKch());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("cjInfo", cjInfo);
		return SUCCESS;
	}
	public String updateXscj() throws Exception {
		// TODO Auto-generated method stub
		ScoreTable cj1=null;
		ScoreTableID cjId1=new ScoreTableID();
		cjId1.setXsb(cj.getId().getXsb());
		cjId1.setKcb(cj.getId().getKcb());
		if(cjService.getXsCj(cj.getId().getXsb().getXh(), cj.getId().getKcb().getKch())==null)
		{
			cj1=new ScoreTable();
			cj1.setId(cjId1);
		}
		else
		{
			cj1=cjService.getXsCj(cj.getId().getXsb().getXh(), cj.getId().getKcb().getKch());
		}
		CourseTable kc1=kcService.find(cj.getId().getKcb().getKch());
		cj1.setCj(cj.getCj());
		if(cj.getCj()>60||cj.getCj()==60)
		{
			cj1.setXf(kc1.getXf());
		}
		else
			cj1.setXf(0);
		Map request=(Map) ActionContext.getContext().get("request");
		cjService.update(cj1);
		return SUCCESS;
	}
	
}
