package com.goaltech.reserve.service;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;
import com.goaltech.reserve.vo.ReservationListVO;

import java.util.List;

public interface ReserveService {

	public List<Long> findPeriodDays();
	public void insertReservation();
	public GroundRuntimeResponseVO selectByRuntime(Long code);
	public ReservationListVO selectByList(String code,String date);
}
