<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Join</title>
</head>
<body>
<form action="insertMember.do">
	<div class="member">
		<!-- 1. �ΰ� -->
		<img class="logo" src="./images/images2/logo-naver.png">

		<!-- 2. �ʵ� -->
		<div class="field">
			<b>���̵�</b> <span class="placehold-text" name="user_id"><input type="text"></span>
		</div>
		<div class="field">
			<b>��й�ȣ</b> <input class="userpw" type="password" name="user_pw">
		</div>
		<div class="field">
			<b>��й�ȣ ��Ȯ��</b> <input class="userpw-confirm" type="password">
		</div>
		<div class="field">
			<b>�̸�</b> <input type="text" name="user_name">
		</div>

		<div class="field">
			<b>��ȭ��ȣ</b> <input type="text" name="user_phone">
		</div>

		<!-- 5. �̸���_��ȭ��ȣ -->
		<div class="field">
			<b>���� Ȯ�� �̸���<small>(����)</small></b> <input type="email"
				placeholder="�����Է�">
		</div>

		<!-- 6. �����ϱ� ��ư -->
		<input type="submit" value="���� �Ϸ�">
</form>

	</div>
</body>
</html>