
package cn.com.yhy.entity;

/** @author  作者 ：Mr.Yuan
 	   @date 创建时间：2016年6月28日 下午12:30:01 
       @version 1.0 
*/
public class Users {
		private int sid;
		private String username;
		private String password;
		private String concat;
		private String company;
		private String phone;
		private String qq;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		
		public String getConcat() {
			return concat;
		}
		public void setConcat(String concat) {
			this.concat = concat;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getQq() {
			return qq;
		}
		public void setQq(String qq) {
			this.qq = qq;
		}
		
}
