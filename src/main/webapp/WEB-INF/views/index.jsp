<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script>
   var message = "${message}";
   
   if(message == 'fail'){
      alert('로그인 실패하였습니다.');
   }
   
   function changeAction(type){
	   if(type == "r"){
		   document.form.action = "/member/login/";
		   document.form.method = "post";
		   document.form.submit;
	   }else if(type == "u"){
		   document.form.action = "/member/update/";
		   document.form.method = "post";
		   document.form.submit;
	   }else if(type == "d"){
		   document.form.action = "/member/delete/";
		   document.form.method = "post";
		   document.form.submit;
	   }
	   
   }
</script>
<body>
<form name="form" >
<div>
	<div>아이디 : <input type="text" name="id" /></div>
	<div>패스워드 :<input type="password" name="password"/></div>
	<div>변경할 패스워드 :<input type="password" name="password_after"/></div>
	<div><button onclick="changeAction('r')">로그인</button></div>
	<div><button onclick="changeAction('u')">업데이트</button></div>
	<div><button onclick="changeAction('d')">삭제</button></div>
	<div><button><a href="member" >MemberJoin</a></button></div>
</div>
</form>
</body>
</html>