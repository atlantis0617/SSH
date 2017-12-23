package cn.com.yhy.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.yhy.dao.UserDao;
import cn.com.yhy.entity.Users;
import cn.com.yhy.service.UserService;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年7月6日 下午4:01:14 
       @version 1.0 
*/
@Service
public class StuSerImp implements UserService {
   private UserDao sd;
   @Resource
	public void setSd(UserDao sd) {
	this.sd = sd;
}

	@Override
	public boolean reg(Users user) {
		String hql="From Users where username = ?";
		Object [] obj = {user.getUsername()};
		List<Object> list =sd.findUser(hql, obj);
		if(list.size()>0){
			return false;
		}
		sd.addUser(user);
		return true;
	}

	@Override
	public List<Object> login(Users user) {
		String hql = "From Users where username = ? and password = ?";
		Object[] obj = {user.getUsername(),user.getPassword()};
		return sd.findUser(hql, obj);
	}

}
