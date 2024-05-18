<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/include/header.jsp" %>
<div class="container">
	<div>
		<h1> ${runtimeVO.name} 시작시간 : ${runtimeVO.startTime}</h1>
		<h1> ${runtimeVO.name} 종료시간 : ${runtimeVO.endTime}</h1>
			<a id="dateOutput" href="reservationform.do"></a>
		
		   ${listVO.book_date}..
		<ul>
		
			<% List<Long> days = (List<Long>)request.getAttribute("periodDays");
			   for (int i = 0; i < days.size(); i++) {
				Long day = days.get(i); 
			%>
		
				<a href="<%= day %>.do" id="<%= day %>"> <%= day %> </a><br>
			<% } %>
		</ul>
	</div>
</div>
<%@include file="/include/footer.jsp" %>