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
import com.goaltech.reserve.vo.ReservationListVO;
import com.goaltech.reserve.vo.ReservationRequestVO;

@Service
@MapperScan("com.goaltech.reserve.mapper")
public class ReserveServiceImpl implements ReserveService {

	@Autowired
	private ReserveMapper reserveMapper;
	
	@Override
	public List<Long> findPeriodDays() {
		int period = 14;
		List<Long> periodDays = new ArrayList<Long>();
		Instant current = Instant.now();
		for (int i = 0; i < period; i++) {
			periodDays.add(current.plus(i, ChronoUnit.DAYS).toEpochMilli());
		}
		
		return periodDays;
	}
	
	@Override
	public GroundRuntimeResponseVO selectByRuntime(Long code) {
		Long ground_id = code;
		GroundRuntimeResponseVO runtimeVO = reserveMapper.selectByRuntime(ground_id);
		return runtimeVO;
	}
	
	@Override
	public List<ReservationListVO> selectByList(String ground_id,String today) {
//		Date now = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		//String today = formatter.format(now);
//		String today = "20240518";
//		String ground_id = "01";
//		System.out.println(today);
		System.out.println("=impl=");
		System.out.println(ground_id);
		System.out.println(today);
		List<ReservationListVO> listVO = reserveMapper.selectByList(today,ground_id);
		System.out.println("Å×½ºÆ®" + listVO.get(0).getBook_date());
		return listVO;
	}	

	
	@Override
	public void insertReservation() {
		ReservationRequestVO requestVO = new ReservationRequestVO();
		requestVO.setPermit("1");
		requestVO.setUser_id("bbbb");
		requestVO.setGround_id("2");
		requestVO.setBook_code("1");
		requestVO.setBook_datetime("2024-04-13");
		requestVO.setTime_code_id("14");
		
		reserveMapper.insertReservation(requestVO);
	}

}
