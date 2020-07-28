<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<html>
<head>
<script type="text/javascript">
window.onload = function () {
	var chk = '${check}';
	if(chk==='1'){
		alert("회원가입 성공")
	}
}
</script>
<style type="text/css">

</style>
</head>
<body  oncopy="return false" oncut="return false" onpaste="return false">
<center>

<h1>login.jsp-LoginPage</h1>
<form action="access" name="loginFrm" method="post">
ID : <input type="text" name="m_id"><br>
PW : <input type="password" name="m_pw"><br>
<button>login</button>
${msg}
<a href="join">join</a>
</form>
</center>
</body>
</html>