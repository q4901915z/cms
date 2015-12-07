<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>商品</title>

</head>

<body>
<div class="tab-content">
	<ul>
		<c:forEach var="item" items="${Products}">
	    	<li>
	    		<div style="padding: 20px">
	    			<div class="producticon"> <img src="${item.snapshotsUrl }"  width="100" height="100px" alt="${item.productName }"> </div>
	    		</div>
	    	</li>
    	</c:forEach>
	</ul>

</div>

</body>



</html>
