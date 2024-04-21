<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>

<h1> Form 페이지</h1>
<h3> 날짜 : "${ id }"</h3>
<form action="reserve.do" method="post">
	<button type=submit>예약</button>
</form>

</body>
</html>