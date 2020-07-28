<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body  oncopy="return false" oncut="return false" onpaste="return false">
<center>
${check}
<h1>회원가입 화면</h1>
<form action="joinaccess" method="post">
ID : <input type="text" name="m_id" class="test"><br>
<input type="button" id="check" value="중복검사">
<div id="result"></div><br>
PW : <input type="password" name="m_pw" class="test"><br>
NAME : <input type="text" name="m_name" class="test"><br>
BIRTH : <input type="text" name="m_birth" class="test"><br>
ADDR : <input type="text" name="m_addr" class="test"><br>
PHONE : <input type="text" name="m_phone" class="test"><br>
<button type="button" id="btn">join</button>
</form>
</center>
<script type="text/javascript">
$("#btn").click(function () {
	for(var i = 0 ; i<$(".test").length;i++){
		if($(".test")[i].value==""||$(".test")[i].value==null){
			alert("입력하지 않은 값이 있습니다.");
			return;
		}
	}
	$("#btn").attr("type","submit");
	
})
</script>
</body>
</html>