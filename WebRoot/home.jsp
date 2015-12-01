<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <title>简单的轮播（Carousel）插件</title>
</head>
<body>

<div id="myCarousel" class="carousel slide">
   <!-- 轮播（Carousel）指标 -->
   <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
   </ol>   
   <!-- 轮播（Carousel）项目 -->
   <div class="carousel-inner">
      <div class="active item" data-interval="true">
         <img src="/cms/static/images/banner/2.jpg" alt="First slide" width=100%>
         <div class="carousel-caption">标题 1</div>
      </div>
      <div class="item" data-interval="true">
         <img src="/cms/static/images/banner/3.jpg" alt="Second slide" width=100%>
         <div class="carousel-caption">标题 2</div>
      </div>
   </div>
   <!-- 轮播（Carousel）导航 -->
   <a class="carousel-control left" href="#myCarousel" 
      data-slide="prev"></a>
   <a class="carousel-control right" href="#myCarousel" 
      data-slide="next"></a>
</div> 
</body>
</html>
