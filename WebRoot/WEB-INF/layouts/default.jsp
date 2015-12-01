<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>
    <sitemesh:write property='title' /> - ltcms
</title>
<sitemesh:write property='head' />
</head>
<body>
    <hr />
    <sitemesh:write property='body' />
    <hr />
    <footer>footer</footer>
</body>
</html>




