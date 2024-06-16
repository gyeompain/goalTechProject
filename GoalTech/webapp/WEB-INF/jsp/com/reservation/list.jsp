<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/include/header.jsp" %>
<%@page import="com.goaltech.reserve.vo.ReservationListVO"%>

	<div>
	<img src ="/img/choice_1.png" onclick="list.do?code=01">
	</div>
		<div>
	<img src ="/img/choice_2.png" onclick="list.do?code=02">
	</div>
<div>
</div>

<div class="container">
<!-- 만약  id값이 있다면? 아래 소스 호출 -->
	<div>
				
			<% List<ReservationListVO> days = (List<ReservationListVO>)request.getAttribute("GudanList");
			   
			for (int i = 0; i < days.size(); i++) {
				   ReservationListVO day = days.get(i); 
			%>
		
			 <%= day.getBook_date() %>/<%= day.getStart_time() %> <br>
			<% } %>
		</ul>
	</div>
</div>
<%@include file="/include/footer.jsp" %>