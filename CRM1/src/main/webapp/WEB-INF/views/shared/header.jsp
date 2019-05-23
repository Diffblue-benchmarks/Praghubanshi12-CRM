<%-- 
    Document   : header
    Created on : May 22, 2019, 10:42:07 AM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var ="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${SITE_URL}/webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="${SITE_URL}/webjars/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet"/>
        </head>
    <body>
        <div class ="container">
            <%@include file = "menu.jsp" %>
