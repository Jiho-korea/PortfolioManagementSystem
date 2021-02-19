<%--
========================================================================
파    일    명 : left.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.02
작  성  내  용 : 죄측메뉴
========================================================================
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- Sidebar Start-->
<c:choose>
	<c:when test="${param.memberLevel eq 'ML03'}">
		<div class="sidebar sidebar-dark bg-dark">
			<ul class="list-unstyled">
				<li><a href="#sm_expand_1" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.management.portfolio" /></a>
					<ul id="sm_expand_1" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.certificate" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.project" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.voluntary" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.participation" /></a></li>
					</ul></li>
				<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.check.portfolio" /></a></li>

				<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.support.enterprise" /></a></li>
			</ul>
		</div>

	</c:when>

	<c:when test="${param.memberLevel eq 'ML02'}">
		<div class="sidebar sidebar-dark bg-dark">
			<ul class="list-unstyled">
				<li><a href="#sm_expand_1" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.management.student" /></a>
					<ul id="sm_expand_1" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.first" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.second" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.third" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.fourth" /></a></li>
					</ul></li>
				<li><a href="#sm_expand_2" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.management.company" /></a>
					<ul id="sm_expand_2" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.list" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.application" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.code" /></a></li>
					</ul></li>
				<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.check.project" /></a></li>

			</ul>
		</div>
	</c:when>

	<c:when test="${param.memberLevel eq 'ML01'}">
		<div class="sidebar sidebar-dark bg-dark">
			<ul class="list-unstyled">
				<li><a href="#sm_expand_1" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.management.student" /></a>
					<ul id="sm_expand_1" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.first" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.second" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.third" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.fourth" /></a></li>
					</ul></li>
				<li><a href="#sm_expand_2" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.management.company" /></a>
					<ul id="sm_expand_2" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.list" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.application" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.company.code" /></a></li>
					</ul></li>
				<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.check.project" /></a></li>

			</ul>
		</div>
	</c:when>

	<c:when test="${param.memberLevel eq 'ML04'}">
		<div class="sidebar sidebar-dark bg-dark">
			<ul class="list-unstyled">
				<li><a href="#sm_expand_1" data-toggle="collapse">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.check.student" /></a>
					<ul id="sm_expand_1" class="list-unstyled collapsing">
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.first" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.second" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.third" /></a></li>
						<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
									code="sidebar.management.student.fourth" /></a></li>
					</ul></li>
				<li><a href="#">&nbsp;&nbsp;&nbsp;<spring:message
							code="sidebar.check.project" /></a></li>

			</ul>
		</div>
	</c:when>
</c:choose>

<!-- Sidebar End-->
