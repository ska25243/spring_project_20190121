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
      alert('�α��� �����Ͽ����ϴ�.');
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
	<div>���̵� : <input type="text" name="id" /></div>
	<div>�н����� :<input type="password" name="password"/></div>
	<div>������ �н����� :<input type="password" name="password_after"/></div>
	<div><button onclick="changeAction('r')">�α���</button></div>
	<div><button onclick="changeAction('u')">������Ʈ</button></div>
	<div><button onclick="changeAction('d')">����</button></div>
	<div><button><a href="member" >MemberJoin</a></button></div>
</div>
</form>
</body>
</html>