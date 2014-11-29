package com.javaweb.ch11.student.action;
import java.util.Map;
import com.javaweb.ch11.student.model.LoginTable;
import com.javaweb.ch11.student.service.LoginService;
import com.javaweb.ch11.student.serviceimp.LoginServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//用户登录Action，获取表单数据，处理逻辑类
public class LoginAction extends ActionSupport {
   //登录列表初始化
	private LoginTable dl;
	//获取登录列表信息
	public LoginTable getDl() {
		return dl;
	}
	//将登录信息保存到表单中
	public void setDl(LoginTable dl) {
		this.dl = dl;
	}
	//执行登录操作
	public String execute() throws Exception {
		//调用业务层方法
		LoginService dlService=new LoginServiceImp();
		LoginTable user=dlService.find(dl.getXh(), dl.getKl());
		if(user!=null)
		{
			Map session=(Map) ActionContext.getContext().get("session");
			session.put("user", dl.getXh());
			return SUCCESS;
		}
		else
			return ERROR;
	}   
}
