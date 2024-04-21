package com.goaltech.reserve.vo;

public class ReservationRequestVO {
	private String permit;
	private String user_id;
	private String ground_id;
	private String book_code;
	private String book_datetime;
	private String time_code_id;
	
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getGround_id() {
		return ground_id;
	}
	public void setGround_id(String ground_id) {
		this.ground_id = ground_id;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getBook_datetime() {
		return book_datetime;
	}
	public void setBook_datetime(String book_datetime) {
		this.book_datetime = book_datetime;
	}
	public String getTime_code_id() {
		return time_code_id;
	}
	public void setTime_code_id(String time_code_id) {
		this.time_code_id = time_code_id;
	}
}
