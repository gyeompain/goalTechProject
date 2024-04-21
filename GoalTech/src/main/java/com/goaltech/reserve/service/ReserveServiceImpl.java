package com.goaltech.reserve.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goaltech.reserve.mapper.ReserveMapper;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;
import com.goaltech.reserve.vo.ReservationRequestVO;

@Service
@MapperScan("com.goaltech.reserve.mapper")
public class ReserveServiceImpl implements ReserveService {

	@Autowired
	private ReserveMapper reserveMapper;
	
	@Override
	public List<Long> findPeriodDays() {
		// 출력 기간 설정(임의의 값 할당)
		int period = 14;
		List<Long> periodDays = new ArrayList<Long>();
		Instant current = Instant.now();
		for (int i = 0; i < period; i++) {
			periodDays.add(current.plus(i, ChronoUnit.DAYS).toEpochMilli());
		}
		
		return periodDays;
	}
	
	@Override
	public GroundRuntimeResponseVO selectByRuntime() {
		// TODO : 예약 페이지에서 A구장, B구장 클릭 시 ground_name 값 변경하기
		String ground_name = "A";
		GroundRuntimeResponseVO runtimeVO = reserveMapper.selectByRuntime(ground_name);
		return runtimeVO;
	}
	
	@Override
	public void insertReservation() {
		ReservationRequestVO requestVO = new ReservationRequestVO();
		// TODO : FORM에서 가져온 날짜, 시간 데이터, ground_name 설정하기
		// TODO : 클릭한 종료 시간 데이터 설정하기
		// 가데이터로 insert 성공 -> 입력받은 값으로 대체하기
		requestVO.setPermit("1");
		requestVO.setUser_id("bbbb");
		requestVO.setGround_id("2");
		requestVO.setBook_code("1");
		requestVO.setBook_datetime("2024-04-13");
		requestVO.setTime_code_id("14");
		
		reserveMapper.insertReservation(requestVO);
	}
	
}