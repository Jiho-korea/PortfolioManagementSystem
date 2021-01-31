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
		<div class="col-lg-4 col-md-12 mb-5">
			<div class="row d-flex justify-content-center">
				<img src="${pageContext.request.contextPath}/img/face.jpg"
					alt="Chart Image" width="100">

				<div class="col-8 pr-3">
					<div class="row w-100">
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">성명</div>
						<div
							class="col-9 pl-0 pr-0 w-75 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row w-100">
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">학번</div>
						<div
							class="col-5 pl-0 pr-0 w-50 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">병역</div>
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row w-100">
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">
							생년<br>월일
						</div>
						<div
							class="col-9 pl-0 pr-0 w-75 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row w-100">
						<div
							class="col-2 w-25 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">
							출신<br>고교
						</div>
						<div
							class="col-9 pl-0 pr-0 w-75 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
				</div>

			</div>
			<div
				class="row mt-2 w-100 d-flex justify-content-center align-items-center"
				style="height: 77px;">
				<div
					class="col-1 h-100 pt-0 pb-0 d-flex justify-content-center align-items-center"
					id="title">연락처</div>

				<div class="col-10 pr-0">
					<div class="row">
						<div
							class="col-3 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">주소</div>
						<div
							class="col-8 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">휴대폰</div>
						<div
							class="col-8 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
					<div class="row">
						<div
							class="col-3 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="title">이메일</div>
						<div
							class="col-8 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
							id="content">내용</div>
					</div>
				</div>
			</div>
			<div
				class="row w-100 mt-3 d-flex justify-content-center align-items-center">
				<div
					class="col-11 mt-1 d-flex justify-content-center align-items-center"
					id="title">대학성적</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="title">학기</div>
				<div
					class="col-3 pl-0 pr-0 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">평균평점</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">1학년 1학기</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">4.5</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="title">총 평점</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">4.5</div>
			</div>
			<div
				class="row mt-2 w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-11 mt-1 d-flex justify-content-center align-items-center"
					id="title">고등학교 성적</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="title">고등학교</div>
				<div
					class="col-3 pl-0 pr-0 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="title">평균등급</div>
			</div>
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div
					class="col-8 mt-1 d-flex justify-content-center align-items-center"
					id="content">OO고등학교</div>
				<div
					class="col-3 mt-1 ml-1 d-flex justify-content-center align-items-center"
					id="content">1.0</div>
			</div>
		</div>
		<div
			class="col-lg-4 mb-5 col-md-12 w-100 h-100 d-flex justify-content-center align-items-center">
			<div class="row w-100 d-flex justify-content-center" id="second">
				<div class="col-11 d-flex justify-content-center align-items-center"
					id="title">개인능력평가표</div>

				<div class="row mt-3 d-flex justify-content-center">
					<div
						class="col-11 d-flex justify-content-center align-items-center">
						<img src="${pageContext.request.contextPath}/img/chart.png"
							alt="Chart Image" width="200">
					</div>
				</div>
				<div
					class="row w-100 mt-3 d-flex justify-content-center align-items-center">
					<div
						class="col-11 d-flex justify-content-center align-items-center"
						id="title">학과 교수 의견</div>
				</div>

				<div
					class="row w-100 mt-1 d-flex justify-content-center align-items-center">
					<div
						class="col-3 pl-0 pr-0 border-right-10 border-white d-flex justify-content-center align-items-center"
						id="title">이름</div>
					<div
						class="col-8 ml-1 d-flex justify-content-center align-items-center"
						id="title">의견</div>
				</div>

				<div
					class="row w-100 mt-1 d-flex justify-content-center align-items-center"
					style="height: 70px;">
					<div
						class="col-3 w-100 h-100 border-right-10 border-white d-flex justify-content-center align-items-center"
						id="content">OOO</div>
					<div
						class="col-8 w-100 h-100 ml-1 d-flex justify-content-center align-items-center"
						id="content">내용</div>
				</div>

				<div
					class="row w-100 mt-1 d-flex justify-content-center align-items-center"
					style="height: 70px;">
					<div
						class="col-3 w-100 h-100 border-right-10 border-white d-flex justify-content-center align-items-center"
						id="content">OOO</div>
					<div
						class="col-8 w-100 h-100 ml-1 d-flex justify-content-center align-items-center"
						id="content">내용</div>
				</div>

				<div
					class="row w-100 mt-1 d-flex justify-content-center align-items-center"
					style="height: 70px;">
					<div
						class="col-3 w-100 h-100 border-right-10 border-white d-flex justify-content-center align-items-center"
						id="content">OOO</div>
					<div
						class="col-8 w-100 h-100 ml-1 d-flex justify-content-center align-items-center"
						id="content">내용</div>
				</div>
				<div
					class="row w-100 mt-1 mb-3 d-flex justify-content-center align-items-center"
					style="height: 70px;">
					<div
						class="col-3 w-100 h-100 border-right-10 border-white d-flex justify-content-center align-items-center"
						id="content">OOO</div>
					<div
						class="col-8 w-100 h-100 ml-1 d-flex justify-content-center align-items-center"
						id="content">내용</div>
				</div>

			</div>


		</div>
		<div
			class="col-lg-4 mb-5 col-md-12 w-100 h-100 d-flex justify-content-center align-items-center">
			<div
				class="row w-100 d-flex justify-content-center align-items-center">
				<div class="col-12 d-flex justify-content-center align-items-center"
					id="title">SW 제작 능력</div>

				<div
					class="row mt-2 pl-0 pr-0 w-100 d-flex justify-content-center align-items-center"
					style="height: 160px;">
					<div
						class="col-1 h-100 pt-0 pb-0 d-flex justify-content-center align-items-center"
						id="title">전공 평균 성적</div>

					<div
						class="col-1 h-100 pt-0 pb-0 ml-1 d-flex justify-content-center align-items-center"
						id="content">4.5</div>

					<div class="col-9 pr-0">
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">HTML</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">JSP실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">JavaScript</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Java응용</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">JavaScript실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Java실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Database</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Spring</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Database실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">Spring실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
						<div class="row">
							<div
								class="col-5 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">JSP</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
							<div
								class="col-4 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">UI/UX실습</div>
							<div
								class="col-1 pl-0 pr-0 mt-1 mb-1 ml-1 d-flex justify-content-center align-items-center"
								id="content">A+</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="w-100"></div>
		<!-- Force next columns to break to new line -->
		<div class="row" id="main">
			<div class="col-lg-4 col-md-12">대칼럼4</div>
			<div class="col-lg-4 col-md-12">대칼럼5</div>
			<div class="col-lg-4 col-md-12">대칼럼6</div>
		</div>

	</div>
</div>
