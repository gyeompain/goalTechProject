<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="com.goaltech.login.vo.UserVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

HttpSession sessions = request.getSession();
UserVO user = (UserVO)session.getAttribute("User");


if(user.getUser_id() !=null){
	out.print("Hello "+ user.getUser_id()) ;
}else{
	out.print("Hello");
}
%>
<a href="login.do">login page 이동</a>
<a href="join.do">join page 이동</a>
</body>
</html>