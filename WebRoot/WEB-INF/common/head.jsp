<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="header">
        <div class="logo">
            <a class="logo" href="/">
                <img src="/static/img/logo.jpg"  height="55" />
            </a>
        </div>
     
        <ul class="navbar-nav">
                    <li>
                        <a href="/" >首页 </a>
                    </li>
                    <li>
                        <a href="/product/apps" >产品服务</a>
                    </li>
                    <li>
                        <a href="/guide" >新手指引</a>
                    </li>
                    <li> 
                        <a href="/partner/customer" >合作伙伴</a>
                    </li>
                    <li>
                        <a href="/support/help" >帮助中心</a>
                    </li>
        </ul>
        
        <c:if test="${empty LOGIN_INFO_SESSION_KEY}">
        <div class="loginbar">
            <div class="login">
                <a href="/login/in" class="btn-login">
                    登录
                </a>
            </div>
            <div class="login">
                <a href="/login/add" class="btn-reg">
                    加入
                </a>
            </div>
        </div>
        </c:if>
        
        <c:if test="${not empty LOGIN_INFO_SESSION_KEY}">
        <div class="loginbar">
            <div class="user">
                <a href="/">
                <span>欢迎，${sessionScope.LOGIN_INFO_SESSION_KEY.userName}</span>
                </a>
                &nbsp;&nbsp;
                <a href="/login/logout">
                    <span>退出</span>
                </a>
            </div>
        </div>
        </c:if>
        
    </div>