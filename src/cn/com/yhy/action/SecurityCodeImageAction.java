package cn.com.yhy.action;

import java.io.ByteArrayInputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.yhy.util.SecurityCode;
import cn.com.yhy.util.SecurityImage;
@Results({@Result(name = "success", type = "stream", params = {  
        "contentType", "image/jpeg",  
        "inputName", "imageStream",  
        "bufferSize",  
        "4096" })})  
public class SecurityCodeImageAction  extends ActionSupport  implements SessionAware{
	 	private static final long serialVersionUID = 1496691731440581303L;  
	    //图片流  
	    private ByteArrayInputStream imageStream;  
	    //session域  
	    private Map<String, Object> session ;  
	    
	    public ByteArrayInputStream getImageStream() {  
	        return imageStream;  
	    }  
	    public void setImageStream(ByteArrayInputStream imageStream) {  
	        this.imageStream = imageStream;  
	    }  
	    public void setSession(Map<String, Object> session) {  
	        this.session = session;  
	    }  
	    @Action("imagecode")  
	    public String execute() throws Exception {  
	        //如果开启Hard模式，可以不区分大小写  
	        //String securityCode = SecurityCode.getSecurityCode(4,SecurityCodeLevel.Hard, false).toLowerCase();  
	          
	        //获取默认难度和长度的验证码  
	        String securityCode = SecurityCode.getSecurityCode();  
	        imageStream = SecurityImage.getImageAsInputStream(securityCode);  
	        //获取request
	        HttpServletRequest request = ServletActionContext.getRequest();
	        //放入session中  
	        session.put("securityCode", securityCode);
	        request.getSession().setAttribute("map", session);
	        return SUCCESS;  
	    }  
}
