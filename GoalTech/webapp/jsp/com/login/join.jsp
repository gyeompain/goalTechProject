<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Join</title>
</head>
<body>

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

		<!-- 3. 필드(생년월일) -->
		<div class="field birth">
			<b>생년월일</b>
			<div>
				<input type="number" placeholder="년(4자)"> <select>
					<option value="">월</option>
					<option value="">1월</option>
					<option value="">2월</option>
					<option value="">3월</option>
					<option value="">4월</option>
					<option value="">5월</option>
					<option value="">6월</option>
					<option value="">7월</option>
					<option value="">8월</option>
					<option value="">9월</option>
					<option value="">10월</option>
					<option value="">11월</option>
					<option value="">12월</option>
				</select> <input type="number" placeholder="일">
			</div>
		</div>

		<!-- 4. 필드(성별) -->
		<div class="field gender">
			<b>성별</b>
			<div>
				<label><input type="radio" name="gender">남자</label> <label><input
					type="radio" name="gender">여자</label> <label><input
					type="radio" name="gender">선택안함</label>
			</div>
		</div>

		<!-- 5. 이메일_전화번호 -->
		<div class="field">
			<b>본인 확인 이메일<small>(선택)</small></b> <input type="email"
				placeholder="선택입력">
		</div>

		<!-- 6. 가입하기 버튼 -->
		<input type="submit" value="가입 완료">


	</div>
</body>
</html>