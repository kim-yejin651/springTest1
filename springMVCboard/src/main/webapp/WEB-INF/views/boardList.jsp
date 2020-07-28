<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
window.onload=function(){
history.replaceState({}, null, location.pathname);
}
console.log(JSON.parse('${bList2}'))
</script>
</head>
<body>
	<h3>boardList</h3>
	<table>
	<c:forEach items="${bList}" var="board">
		<tr style='text-align: center;'>
		<td>${board.b_num}</td>
		<td>${board.b_title}</td>
		<td>${board.b_id}</td>
		<td>${board.b_date}</td>
		<td>${board.b_view}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>