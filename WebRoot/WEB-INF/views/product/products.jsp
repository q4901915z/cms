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
<div class="tab-content" style="min-height: 400px">
	<ul class="productul">
		<c:forEach var="item" items="${Products}">
	    	<li  class="productli">
	    		<div class="productitem">
	    			<div> <img src="/cms/static/images/product/wangzong/aaaa.jpg"  width="200px" height="140px" alt="配件"> </div>
	    			<p class="productName">${item.productName }</p>
	    		</div>
	    	</li>
    	</c:forEach>
	</ul>

</div>

</body>



</html>
