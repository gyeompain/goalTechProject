<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation</title>
</head>
<body>
<h1>A구장 시작시간 : ${runtimeVO.startTime}</h1>
<h1>A구장 종료시간 : ${runtimeVO.endTime}</h1>
	<a id="dateOutput" href="reservationform.do"></a>

<ul>
	<% List<Long> days = (List<Long>)request.getAttribute("periodDays");
	   for (int i = 0; i < days.size(); i++) {
		Long day = days.get(i); 
	%>

		<a href="<%= day %>.do" id="<%= day %>"> <%= day %> </a><br>
	<% } %>
</ul>


</body>
</html>