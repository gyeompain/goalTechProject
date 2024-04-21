package com.goaltech.reserve.service;

import java.util.List;

import com.goaltech.reserve.vo.GroundRuntimeResponseVO;

public interface ReserveService {

	public List<Long> findPeriodDays();
	public GroundRuntimeResponseVO selectByRuntime();
	public void insertReservation();
}
