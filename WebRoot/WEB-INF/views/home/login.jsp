<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0" />
<title>登录</title>

<link rel="stylesheet" type="text/css" href="/cms/static/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/cms/static/main.css" />
<link href="/cms/static/login/login-soft.css" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="/cms/static/js/login/favicon.ico" />
<script src="/cms/static/js/jquery.min.js" type="text/javascript"></script>
<script src="/cms/static/login/jquery.backstretch.min.js" type="text/javascript"></script>


</head>

<body>
<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>登录</small></h1>
			</div>
			<div class="login-content ">
			<div class="form">
			<form action="/cms/user/showUser" method="post">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" id="userName" name="userName" value="${user.userName }" class="form-control" placeholder="用户名">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" id="password" name="password"  value="${user.password }" class="form-control" placeholder="密码">
						</div>
					</div>
				</div>
				<div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button type="submit" class="btn btn-sm btn-info"><span class="glyphicon glyphicon-off"></span> 登录</button>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-6 link">
						<p class="text-center remove-margin"><small>忘记密码？</small> <a href="javascript:void(0)" ><small>找回</small></a>
						</p>
					</div>
					<div class="col-xs-6 link">
						<p class="text-center remove-margin"><small>还没注册?</small> <a href="javascript:void(0)" ><small>注册</small></a>
						</p>
					</div>
				</div>
			</form>
			</div>
		</div>
	</div>
</div>

<div style="text-align:center;">
</div>
<script >
 jQuery(document).ready(function() {     
       $.backstretch([
        "/cms/static/login/1.jpg"
        ], {
          fade: 2000,
          duration: 5000
    }
    );
}); 
</script>

</body>



</html>
