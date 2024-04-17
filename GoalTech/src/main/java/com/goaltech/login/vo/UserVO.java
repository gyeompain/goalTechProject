package com.goaltech.login.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UserVO {
	@NotEmpty(message="ȸ�� ���̵� �Է��� �ʼ��Դϴ�.")
	@Pattern(
	        regexp = "^[a-z]+[a-z0-9]{3,30}$",
	        message = "���̵�� ���ĺ� �ҹ��ڿ� ���ڸ� ����ϸ�, ���ڷ� ������ �� �����ϴ�. (3~30����)"
	)
	private String user_id		=""; //ȸ�����̵�
	private String role_code	=""; //�����ڵ�
	@NotEmpty(message="ȸ�� ��й�ȣ �Է��� �ʼ��Դϴ�.")
	private String user_pw		=""; //ȸ����й�ȣ
	@NotEmpty(message="ȸ�� �̸� �Է��� �ʼ��Դϴ�.")
	private String user_name	=""; //ȸ���̸�
	private String user_phone	=""; //ȸ����ȭ��ȣ
	private String joindate		=""; //��������
	private String user_status  =""; //��������
	private String updated_at   =""; //����������
	
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRole_code() {
		return role_code;
	}
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
}
