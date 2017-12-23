package cn.com.yhy.service;

import java.util.List;

import cn.com.yhy.entity.Users;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年7月6日 下午3:59:35 
       @version 1.0 
*/
public interface UserService {
	public boolean reg(Users user);
	public List<Object> login(Users user);
}
