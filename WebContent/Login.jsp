<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <!-- CSS -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">
        <link rel="stylesheet" href="css/style.css">
<title>登陆页面</title>
</head>
<body>
${mess}
<div class="page-container">
            <h1>Login</h1>
            <form action="user_Log" method="post">
				<div>
					<input type="text" name="user.email" class="username" />
				</div>
                <div>
					<input type="password" name="user.password" class="password" />
                </div>
				<div>
					<img  src="imagecode.action"  id="Verify" style="cursor:pointer;position:absolute; top:164px; left:15px;width: 20%;height:42px;border-radius:10px" alt="看不清，换一张" />
				</div>
				<div>
					<div><input type="text" style="width: 20%" id="veryCode" name="veryCode" class="yzm"  onmouseout="isRightCode()"></div>
				</div>
                <button id="submit"  type="submit">登录</button>
            </form>
            <div class="connect">
                <p>If we can only encounter each other rather than stay with each other,then I wish we had never encountered.</p>
				<p style="margin-top:20px;">如果只是遇见，不能停留，不如不遇见。</p>
            </div>
        </div>
		<div class="alert" style="display:none">
			<h2>消息</h2>
			<div class="alert_con">
				<p id="ts"></p>
				<p style="line-height:70px"><a class="btn">确定</a></p>
			</div>
		</div>

        <!-- Javascript -->
		<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
        <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
		<script>
		$(".btn").click(function(){
			is_hide();
		})
		var u = $("input[name=username]");
		var p = $("input[name=password]");
		$("#submit").live('click',function(){
			if(u.val() == '' || p.val() =='')
			{
				$("#ts").html("用户名或密码不能为空~");
				is_show();
				return false;
			}
			else{
				var reg = /^[0-9A-Za-z]+$/;
				if(!reg.exec(u.val()))
				{
					$("#ts").html("用户名错误");
					is_show();
					return false;
				}
			}
		});
		window.onload = function()
		{
			$(".connect p").eq(0).animate({"left":"0%"}, 600);
			$(".connect p").eq(1).animate({"left":"0%"}, 400);
		}
		function is_hide(){ $(".alert").animate({"top":"-40%"}, 300) }
		function is_show(){ $(".alert").show().animate({"top":"45%"}, 300) }
		</script>
		<script type="text/javascript">
		$(function () {   
		      //点击图片更换验证码  
		    $("#Verify").click(function(){  
		            $(this).attr("src","imagecode.action?timestamp="+new Date().getTime());  
		        });  
		     });  
		</script>
</body>
</html>