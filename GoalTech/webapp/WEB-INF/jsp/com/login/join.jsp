<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>
<form action="insertMember.do" method="post">
	<div class="member">
		<!-- 1. 로고 -->
		<img class="logo" src="./images/images2/logo-naver.png">

		<!-- 2. 필드 -->
		<div class="field">
			<b>아이디</b> <span class="placehold-text" name="user_id"><input type="text"></span>
		</div>
		<div class="field">
			<b>비밀번호</b> <input class="userpw" type="password" name="user_pw">
		</div>
		<div class="field">
			<b>비밀번호 재확인</b> <input class="userpw-confirm" type="password">
		</div>
		<div class="field">
			<b>이름</b> <input type="text" name="user_name">
		</div>

		<div class="field">
			<b>전화번호</b> <input type="text" name="user_phone">
		</div>

		<!-- 5. 이메일_전화번호 -->
		<div class="field">
			<b>본인 확인 이메일<small>(선택)</small></b> <input type="email"
				placeholder="선택입력">
		</div>

		<!-- 6. 가입하기 버튼 -->
		<input type="submit" value="가입 완료">
</form>

</body>
</html>