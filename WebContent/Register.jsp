<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.i18n.properties-1.0.9.js" ></script>
<script type="text/javascript" src="js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/md5.js"></script>
<script type="text/javascript" src="js/page_regist.js?lang=zh"></script>
<title>注册页面</title>
</head>
<body class="loginbody">
${mess}
								<div class="dataEye">
								<div class="loginbox registbox">
								<div class="logo-a">
									<a href="Welcome.html" title="美食网">
										<img src="img/logo-a.png">
									</a>
								</div>
								<div class="login-content reg-content">
								<div class="loginbox-title">
									<h3>注册</h3>
								</div>
				<form id="signupForm" action="user_Reg" method="post">
								<div class="login-error"></div>
								<div class="row">
									<label class="field" for="email">用户名</label>
									<input type="text" value="" class="input-text-user noPic input-click" name="user.username" id="email">
								</div>
								<div class="row">
									<label class="field" for="password">密码</label>
									<input type="password" value="" class="input-text-password noPic input-click" name="user.password" id="password">
								</div>
								<div class="row">
									<label class="field" for="passwordAgain">确认密码</label>
									<input type="password" value="" class="input-text-password noPic input-click" name="passwordAgain" id="passwordAgain">
								</div>
								<div class="row">
									<label class="field" for="contact">联系人</label>
									<input type="text" value="" class="input-text-user noPic input-click" name="user.concat" id="contact">
								</div>
								<div class="row">
									<label class="field" for="company">公司名</label>
									<input type="text" value="" class="input-text-user noPic input-click" name="user.company" id="company">
								</div>
								<div class="row">
									<label class="field" for="tel">公司电话</label>
									<input type="text" value="" class="input-text-user noPic input-click" name="user.phone" id="tel">
								</div>
								<div class="row">
									<label class="field" for="qq">QQ</label>
									<input type="text" value="" class="input-text-user noPic input-click" name="user.qq" id="qq">
								</div>
								<div class="row tips">
									<input type="checkbox" id="checkBox">
									<label>
									我已阅读并同意
									<a href="#" target="_blank">隐私政策、服务条款</a>
									</label>
								</div>
								<div class="row btnArea">
									<input type="submit" value="注册" class="login-btn" id="submit">
								</div>
					</form>
							</div>
							<div class="go-regist">
								已有帐号,请<a href="Login.jsp" class="link">登录</a>
							</div>
						</div>
						
					<div id="footer">
						<div class="dblock">
							<div class="inline-block"><img src="img/logo-gray.png"></div>
							<div class="inline-block copyright">
								<p><a href="#">关于我们</a> | <a href="#">微博</a> | <a href="#">隐私政策</a> | <a href="#">人员招聘</a></p>
								<p> Copyright © 2016 盒饭网</p>
							</div>
						</div>
					</div>
					</div>
					<div class="loading">
						<div class="mask">
							<div class="loading-img">
							<img src="img/loading.gif" width="31" height="31">
							</div>
						</div>
					</div>
</body>
</html>