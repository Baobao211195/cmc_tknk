<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  <!-- Jquery -->
<script src="<c:url value='/static/js/jquery.min.js' />"></script>
<!-- AngularJS -->
<script src="<c:url value='/static/js/angular.min.js' />"></script>
<script src="<c:url value='/static/js/angular-animate.min.js' />"></script>
<script src="<c:url value='/static/js/angular-route.js' />"></script>
<script src="<c:url value='/static/js/ui-bootstrap-tpls-0.14.3.js' />"></script>
<script type="text/javascript">
	var _contextPath = "${pageContext.request.contextPath}";
	function redirectPage(page){
		window.location.href =  _contextPath + page;
	};
</script>
</head>
<style>
@import url(http://fonts.googleapis.com/css?family=Open+Sans:400,700);

body {
  background: #456;
  font-family: 'Open Sans', sans-serif;
}

.login {
  width: 500px;
  margin: 16px auto;
  font-size: 16px;
}

/* Reset top and bottom margins from certain elements */
.login-header,
.login p {
  margin-top: 0;
  margin-bottom: 0;
}

/* The triangle form is achieved by a CSS hack */
.login-triangle {
  width: 0;
  margin-right: auto;
  margin-left: auto;
  border: 12px solid transparent;
  border-bottom-color: #28d;
}

.login-header {
  background: #28d;
  padding: 20px;
  font-size: 1.4em;
  font-weight: normal;
  text-align: center;
  text-transform: uppercase;
  color: #fff;
}

.login-container {
  background: #ebebeb;
  padding: 12px;
}

/* Every row inside .login-container is defined with p tags */
.login p {
  padding: 12px;
}

.login input {
  box-sizing: border-box;
  display: block;
  width: 100%;
  border-width: 1px;
  border-style: solid;
  padding: 16px;
  outline: 0;
  font-family: inherit;
  font-size: 0.95em;
}

.login input[type="email"],
.login input[type="password"] {
  background: #fff;
  border-color: #bbb;
  color: #555;
}

/* Text fields' focus effect */
.login input[type="email"]:focus,
.login input[type="password"]:focus {
  border-color: #888;
}

.login input[type="submit"] {
  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
}

.login input[type="submit"]:hover {
  background: #17c;
}

/* Buttons' focus effect */
.login input[type="submit"]:focus {
  border-color: #05a;
}
</style>
<body>

<div class="login">
	<div class="login-triangle"></div>
		<h3 class="login-header">Bạn đã đăng xuất khỏi hệ thống</h3>	
		<div class="login-container">
			
			<p >

				<input type="submit" onclick="redirectPage('/login')"
					value="Đăng nhập lại">
			</p>
		</div>

</div>
</body>
</html>