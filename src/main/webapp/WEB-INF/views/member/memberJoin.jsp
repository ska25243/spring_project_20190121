<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/member/join/" method="POST">
<div>
	<div>id : <input type="text" name="id" /></div>
	<div>password : <input type="password" name="password"/></div>
	<div>email : <input type="text" name="email"/></div>
	<div>user_name : <input type="text" name="user_name"/></div>
	<div><input type="submit" value="MemberJoinOk"/>
</div>
</form>
</body>
</html>