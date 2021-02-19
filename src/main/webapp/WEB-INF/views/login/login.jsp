<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js" ></script>
  <script src="${pageContext.request.contextPath}/js/login.js"></script>
  <script src="${pageContext.request.contextPath}/js/jsbn.js"></script>
  <script src="${pageContext.request.contextPath}/js/rsa.js"></script>
  <script src="${pageContext.request.contextPath}/js/prng4.js"></script>
  <script src="${pageContext.request.contextPath}/js/rng.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>

<div class="login-page">
  <img src="${pageContext.request.contextPath}/img/login-title.png" class="login-title"></img>
  <div class="form">
    <form class="register-form">
      <input type="text" placeholder="name" name="name"/>
      <input type="text" placeholder="email address" name="email"/>
      <button>Send password</button>
      <p class="message">Want login page? <a href="#">Login</a></p>
    </form>
    <input type="hidden" id="rsaPublicKeyModulus" value='<%=request.getAttribute("publicKeyModulus")%>'/>
    <input type="hidden" id="rsaPublicKeyExponent" value='<%=request.getAttribute("publicKeyExponent")%>' />
    
    <form class="login-form" action="${pageContext.request.contextPath}/loginrequest">
      <input type="text" placeholder="username" id="username"/>
      <input type="password" placeholder="password" id="password"/>
      <input type="hidden" id="securedid"  name="securedid"/>
      <input type="hidden" id="securedpassword"  name="securedpassword"/>
      <button id="loginbtn">login</button>
      <p class="message">Forgot password? <a href="#">Change password</a></p>
    </form>
  </div>
</div>

</body>
</html>