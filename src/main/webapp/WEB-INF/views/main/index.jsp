<%--
========================================================================
파    일    명 : list.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 로그인 시 메인 페이지
========================================================================
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootadmin.min.css">

    <title><spring:message code="header.title" /></title>
</head>
<body class="bg-light">


<c:import url="../included/top.jsp" />


<div class="d-flex">
	<c:import url="../included/left.jsp">
		<c:param value="${level}" name="level" />
	</c:import>


    <div class="content p-4">
        <h2 class="mb-4">Blank/Starter</h2>

        <div class="card mb-4">
            <div class="card-body">
                This is a blank page you can use as a starting point.
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootadmin.min.js"></script>

</body>
</html>
