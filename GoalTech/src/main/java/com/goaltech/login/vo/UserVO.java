package com.goaltech.login.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UserVO {
	@NotEmpty(message="회원 아이디 입력은 필수입니다.")
	@Pattern(
	        regexp = "^[a-z]+[a-z0-9]{3,30}$",
	        message = "아이디는 알파벳 소문자와 숫자를 사용하며, 숫자로 시작할 수 없습니다. (3~30글자)"
	)
	private String user_id		=""; //회원아이디
	private String role_code	=""; //역할코드
	@NotEmpty(message="회원 비밀번호 입력은 필수입니다.")
	private String user_pw		=""; //회원비밀번호
	@NotEmpty(message="회원 이름 입력은 필수입니다.")
	private String user_name	=""; //회원이름
	private String user_phone	=""; //회원전화번호
	private String joindate		=""; //가입일자
	private String user_status  =""; //계정상태
	private String updated_at   =""; //최종수정일
	
	
	
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
