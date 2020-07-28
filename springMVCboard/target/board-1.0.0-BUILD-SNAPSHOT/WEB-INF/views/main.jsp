<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	main 
</h1>

<P>  The time on the server is ${msg}. </P>
 ${id}
${sessionScope.mb.m_id}
${sessionScope.mb.m_name}
${sessionScope.mb.m_point}
${sessionScope.mb.g_name}
</body>
</html>
