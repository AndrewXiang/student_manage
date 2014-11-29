package com.javaweb.ch11.student.action;
import java.util.Map;
import com.javaweb.ch11.student.model.LoginTable;
import com.javaweb.ch11.student.service.LoginService;
import com.javaweb.ch11.student.serviceimp.LoginServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//�û���¼Action����ȡ�����ݣ������߼���
public class LoginAction extends ActionSupport {
   //��¼�б��ʼ��
	private LoginTable dl;
	//��ȡ��¼�б���Ϣ
	public LoginTable getDl() {
		return dl;
	}
	//����¼��Ϣ���浽����
	public void setDl(LoginTable dl) {
		this.dl = dl;
	}
	//ִ�е�¼����
	public String execute() throws Exception {
		//����ҵ��㷽��
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
