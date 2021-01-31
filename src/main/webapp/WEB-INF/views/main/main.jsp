<%--
========================================================================
파    일    명 : main.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 로그인 시 메인 페이지
========================================================================
수    정    자 : 강지호
수    정    일 : 2021.01.30
수  정  내  용 : 학생 포트폴리오 좌측 대칼럼 완성
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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/img/favicon.ico">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/fontawesome-all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootadmin.min.css">

<title><spring:message code="header.title" /></title>
<style type="text/css">
#main {
	margin-top: 30px;
}

#title {
	background-color: #B92133;
	color: white;
}

#content {
	background-color: #E0E0E0;
}
</style>
</head>
<body class="bg-light">


	<c:import url="../included/top.jsp">

	</c:import>


	<div class="d-flex">
		<c:import url="../included/left.jsp">
			<c:param value="${level}" name="level" />
		</c:import>
		<c:choose>
			<c:when test="${level eq 'student'}">
				<c:import url="../portfolio/portfolio.jsp">
					<c:param value="${level}" name="level" />
				</c:import>
			</c:when>
			<c:when test="${level eq 'professor'}">
			
			</c:when>
			
			<c:when test="${level eq 'manager'}">
			
			</c:when>
			
			<c:when test="${level eq 'company'}">
			
			</c:when>
			
		</c:choose>
	</div>

	<script defer src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script defer
		src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script defer
		src="${pageContext.request.contextPath}/js/bootadmin.min.js"></script>

</body>
</html>
