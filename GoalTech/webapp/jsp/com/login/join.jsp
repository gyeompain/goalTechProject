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

		<!-- 3. �ʵ�(�������) -->
		<div class="field birth">
			<b>�������</b>
			<div>
				<input type="number" placeholder="��(4��)"> <select>
					<option value="">��</option>
					<option value="">1��</option>
					<option value="">2��</option>
					<option value="">3��</option>
					<option value="">4��</option>
					<option value="">5��</option>
					<option value="">6��</option>
					<option value="">7��</option>
					<option value="">8��</option>
					<option value="">9��</option>
					<option value="">10��</option>
					<option value="">11��</option>
					<option value="">12��</option>
				</select> <input type="number" placeholder="��">
			</div>
		</div>

		<!-- 4. �ʵ�(����) -->
		<div class="field gender">
			<b>����</b>
			<div>
				<label><input type="radio" name="gender">����</label> <label><input
					type="radio" name="gender">����</label> <label><input
					type="radio" name="gender">���þ���</label>
			</div>
		</div>

		<!-- 5. �̸���_��ȭ��ȣ -->
		<div class="field">
			<b>���� Ȯ�� �̸���<small>(����)</small></b> <input type="email"
				placeholder="�����Է�">
		</div>

		<!-- 6. �����ϱ� ��ư -->
		<input type="submit" value="���� �Ϸ�">


	</div>
</body>
</html>