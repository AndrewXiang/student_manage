package com.javaweb.ch11.student.action;

import java.util.List;
import java.util.Map;


import com.javaweb.ch11.student.model.CourseTable;
import com.javaweb.ch11.student.model.StudentTable;
import com.javaweb.ch11.student.service.CourseService;
import com.javaweb.ch11.student.service.StudentService;
import com.javaweb.ch11.student.serviceimp.CourseServiceImp;
import com.javaweb.ch11.student.serviceimp.StudentServiceImp;
import com.javaweb.ch11.student.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport {

	private int pageNow=1;
	private int pageSize=8; 
	private CourseTable kc; 
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
	public CourseTable getKc() {
		return kc;
	}
	public void setKc(CourseTable kc) {
		this.kc = kc;
	}
	StudentService xsService=new StudentServiceImp();
	CourseService kcService=new CourseServiceImp();
	public String execute() throws Exception {

		return SUCCESS;
	}
	public String addKc() throws Exception {
		CourseTable kc1=new CourseTable();
		String kch=kc.getKch();
		if(kcService.find(kch)!=null)
		{
			return ERROR;
		}
		kc.setKch(kc.getKch());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXs(kc.getXs());
		kc1.setXf(kc.getXf());
		kcService.save(kc);
		return SUCCESS;
	}
	public String kcInfo() throws Exception {
		List list=kcService.FindAll(pageNow, pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		Pager page=new Pager(pageNow, kcService.findKcSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public String findKc() throws Exception {
		String kch=kc.getKch();
		CourseTable kc=kcService.find(kch);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kc", kc);
		return SUCCESS;
	}
	public String deleteKc() throws Exception {
		String kch=kc.getKch();
        kcService.delete(kch);
		return SUCCESS;
	}
	public String updateKcView() throws Exception {
		String kch=kc.getKch();
		CourseTable kcInfo=kcService.find(kch);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kcInfo", kcInfo);
		return SUCCESS;
	}
	public String updateKc() throws Exception {
		CourseTable kc1=kcService.find(kc.getKch());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXs(kc.getXs());
		kc1.setXf(kc.getXf());
		Map request=(Map) ActionContext.getContext().get("request");
		kcService.update(kc);
		return SUCCESS;
	}
}
