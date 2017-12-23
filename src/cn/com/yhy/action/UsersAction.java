package cn.com.yhy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;


import cn.com.yhy.entity.Users;
import cn.com.yhy.service.UserService;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年6月28日 下午12:32:41 
       @version 1.0 
*/
@Controller
public class UsersAction {
	private Users user;
	private UserService sser;
	@Resource
	public void setSser(UserService sser) {
		this.sser = sser;
	}
	
	//用户注册
	public String Reg(){
		HttpServletRequest request = ServletActionContext.getRequest();
		boolean flag = sser.reg(user);
		if(flag){
			request.setAttribute("mess","注册成功，请登录");
			return "regsuc";
		}
		request.setAttribute("mess","用户已存在，请重新注册");
			return "regfal";
	}
	
	//用户登录
	public String Log(){
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Object> list = sser.login(user);
		@SuppressWarnings("unchecked")
		Map<String, Object> session = (Map<String, Object>)request.getSession().getAttribute("map");
		System.out.println(session.get("securityCode"));
		String securityCode = (String)session.get("securityCode");
		String veryCode = request.getParameter("veryCode");
		boolean flag = securityCode.equalsIgnoreCase(veryCode);
		if(list.size()>0 && flag == true){
			Users us = (Users)list.get(0);
			request.getSession().setAttribute("userName", us.getUsername());
			return "logsuc";
		}
		request.setAttribute("mess","用户不存在登录失败！！！请注册！");
		return "logfal";
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
