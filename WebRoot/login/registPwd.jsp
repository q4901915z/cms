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
<title>重置密码</title>

<link rel="stylesheet" type="text/css" href="/cms/static/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/cms/static/main.css" />
<link href="/cms/static/login/login-soft.css" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="/cms/static/js/login/favicon.ico" />
<script src="/cms/static/js/jquery.min.js" type="text/javascript"></script>
<script src="/cms/static/login/jquery.backstretch.min.js" type="text/javascript"></script>


</head>

<body background="/cms/static/login/1.jpg">
<div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>重置密码</small></h1>
			</div>
			<div class="login-content " style="height: 350px;">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" id="userName" name="userName" class="form-control" placeholder="用户名">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" id="password" name="password" class="form-control" placeholder="新密码">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" id="checkpassword" name="checkpassword" class="form-control" placeholder="确认新密码">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" id="sign" name="sign" class="form-control" placeholder="验证码">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-6 link">
					<p class="text-center remove-margin" style="margin-top:0px;">
						<button type="submit" class="btn btn-sm btn-info" onclick="editPwd()"><span class="glyphicon glyphicon-off"></span> 确定</button>
					</p>
					</div>
					<div class="col-xs-6 link">
					<p class="text-center remove-margin" style="margin-top:0px;">
						<button type="submit" class="btn btn-sm btn-info" onclick="back()"><span class="glyphicon glyphicon-off"></span>返回</button>
					</p>
					</div>
				</div>
			</div>
	</div>
</div>

<div style="text-align:center;">
</div>
<script >
function editPwd(){
	var userName=$("#userName").val();
	var password=$("#password").val();
	var checkpassword=$("#checkpassword").val();
	var sign=$("#sign").val();
	if(userName==""||password==""||checkpassword==""||sign==""){
		alert("用户名或者密码,验证码不能为空!");
	}
	if(password!=checkpassword){
		alert("两次密码输入不一致！");
	}
	$.ajax({
        url     : "../user/registPwd",
        type    : "post",
        dataType: "json",
        data : { "userName" : userName,"password" : password,"sign":sign},
        success : function(result) {
        	if(result && result.status != "0") {
        		alert(result.msg);
        	}else{
        		alert(result.msg);
        		window.location.replace("login.jsp");
        	}
       	},
        error : function(result) { alert("系统发生错误！"); }
    });
}

function back(){
	window.location.replace("login.jsp");
}
</script>

</body>



</html>
