<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<title>
    <sitemesh:write property='title' > - ltcms</sitemesh:write>
</title>
<head>
	<sitemesh:write property='head' />
   <link href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"/>
   <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
   <script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
   <link href="/cms/static/css/style.css" rel="stylesheet"/>
   <link href="/cms/static/css/main.css" rel="stylesheet"/>
   <link href='http://fonts.useso.com/css?family=Raleway:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'/>
<!-- dropdown -->
<script src="/cms/static/js/jquery.easydropdown.js"></script>
</head>
<body>
	<div class="header_top">
  <div class="container">
  	<div class="header_top-box">
     <div class="header-top-left">
			  <div class="box">
			  	   	<select tabindex="4" class="dropdown drop">
					   <option value="" class="label" value="">Dollar :</option>
				       <option value="1">Dollar</option>
				       <option value="2">Euro</option>
					</select>
   			   </div>
   			   <div class="box1">
   				       <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">English :</option>
							<option value="1">English</option>
							<option value="2">French</option>
							<option value="3">German</option>
					  </select>
   			   </div>
   				    <div class="clearfix"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">Account</a></li> 
					<li><a href="/cms/user/bootstrap">bootstrap练习</a></li> 
					<li><a href="/cms/user/login">登录</a></li> 
					<li><a href="register.html">注销</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
   </div>
</div>
</div>


    <sitemesh:write property='body' />
    <hr />
    <div class="footer">
	<div class="container">
		<img src="/cms/static/images/pay.png" class="img-responsive" alt=""/>
		<ul class="footer_nav">
		  <li><a href="#">Home</a></li>
		  <li><a href="#">Blog</a></li>
		  <li><a href="#">Shop</a></li>
		  <li><a href="#">Media</a></li>
		  <li><a href="#">Features</a></li>
		  <li><a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=3541e5f06b309edd88b97b3ea1f88a9221902fe204276990956297423cbd5441"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="资料库" title="资料库"></a></li>
		  <li><a href="contact.html">Contact Us</a></li>
		</ul>
		<p class="copy">Copyright &copy; 2015.Company name All rights reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
	</div>
</div>
</body>
</html>




