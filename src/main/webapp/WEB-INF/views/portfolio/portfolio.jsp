<%--
========================================================================
파    일    명 : portfolio.jsp
========================================================================
작    성    자 : 강지호
작    성    일 : 2021.01.31
작  성  내  용 : 학생의 포트폴리오 화면
========================================================================
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">
	<div class="row" id="main">
		<div class="col-lg-4 col-md-12">
			<div class="row">
				<div
					class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">증명사진</div>
				<div class="col-8">
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">성명</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">학번</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">
							생년<br>월일
						</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">
							출신<br>고교
						</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
				</div>

			</div>
			<div class="row mt-2">
				<div
					class="col-1 mt-1 mb-1 ml-1 mr-1 d-flex justify-content-center align-items-center"
					id="title">연락처</div>

				<div class="col-10">
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">주소</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">휴대폰</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">이메일</div>
						<div
							class="col-8 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
				</div>
			</div>
			<div class="row mt-2">
				<div
					class="col-10 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">대학성적</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="title">학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">평균평점</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="title">총 평점</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">4.5</div>
			</div>
			<div class="row mt-2">
				<div
					class="col-10 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">고등학교 성적</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="title">고등학교</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">평균등급</div>
			</div>
			<div class="row">
				<div
					class="col-7 mt-1 ml-1 border-right-10 border-white d-flex justify-content-center align-items-center"
					id="content">똥통고등학교</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">1.0</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-12">대칼럼2</div>
		<div class="col-lg-4 col-md-12">대칼럼3</div>
		<!-- Force next columns to break to new line -->
		<div class="w-100"></div>

		<div class="col-lg-4 col-md-12">대칼럼4</div>
		<div class="col-lg-4 col-md-12">대칼럼5</div>
		<div class="col-lg-4 col-md-12">대칼럼6</div>
	</div>
</div>