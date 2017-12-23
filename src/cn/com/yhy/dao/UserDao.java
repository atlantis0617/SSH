package cn.com.yhy.dao;

import java.util.List;

import cn.com.yhy.entity.Users;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年7月6日 下午3:50:02 
       @version 1.0 
*/
public interface UserDao {
	public void addUser(Users stu);
	public List<Object> findUser(String hql,Object[]obj);
}
