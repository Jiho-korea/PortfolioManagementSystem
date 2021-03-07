<%--
========================================================================
파    일    명 : portfolio.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.31
작  성  내  용 : 학생의 포트폴리오 화면
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.07
작  성  내  용 : 학생은 교수 의견이 안보이도록 수정
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.02.21
작  성  내  용 : 포함되는 방식이 아닌 온전한 페이지로 만듦
========================================================================
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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

div#second {
	border: 3px solid #B92133;
	border-top: 0px;
}
</style>
</head>
<body class="bg-light">
	<c:import url="../included/top.jsp">

	</c:import>
	<div class="d-flex">
		<c:import url="../included/left.jsp">
			<c:param value="${sessionScope.login.memberLevelCode}"
				name="memberLevelCode" />
		</c:import>
		<div class="container">
			<div class="row" id="main">
				
				<%--
		<!-- Force next columns to break to new line -->
		<div class="row" id="main">
			<div class="col-lg-4 col-md-12">대칼럼4</div>
			<div class="col-lg-4 col-md-12">대칼럼5</div>
			<div class="col-lg-4 col-md-12">대칼럼6</div>
		</div>
 		--%>
			</div>
		</div>
	</div>

	<script defer src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script defer
		src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script defer
		src="${pageContext.request.contextPath}/js/bootadmin.min.js"></script>

</body>
</html>


