<%--
========================================================================
파    일    명 : top.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 상단메뉴
========================================================================
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<%-- Header Start --%>
<nav class="navbar navbar-expand navbar-dark bg-primary">
	<a class="sidebar-toggle mr-3" href="#"><i class="fa fa-bars"></i></a>
	<a class="navbar-brand" href="${pageContext.request.contextPath}/main"><spring:message code="header.title" /></a>

	<div class="navbar-collapse collapse">
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a href="#" class="nav-link"><i
					class="fa fa-envelope"></i> 5</a></li>
			<li class="nav-item"><a href="#" class="nav-link"><i
					class="fa fa-bell"></i> 3</a></li>
			<li class="nav-item dropdown"><a href="#" id="dd_user"
				class="nav-link dropdown-toggle" data-toggle="dropdown"><i
					class="fa fa-user"></i> ${sessionScope.login.memberName}</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="dd_user">
					<a href="#" class="dropdown-item"><spring:message code="header.profile" /></a> <a href="${pageContext.request.contextPath}/logout"
						class="dropdown-item"><spring:message code="header.logout" /></a>
				</div></li>
		</ul>
	</div>
</nav>
<!-- Header End -->
