package cn.com.yhy.dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.com.yhy.dao.UserDao;
import cn.com.yhy.entity.Users;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年7月6日 下午3:52:14 
       @version 1.0 
*/
@Repository
public class StuDaoImp implements UserDao {
	private HibernateTemplate template;
	@Resource
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void addUser(Users user) {
		template.save(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> findUser(String hql, Object[] obj) {
		return template.find(hql,obj);
	}

}
