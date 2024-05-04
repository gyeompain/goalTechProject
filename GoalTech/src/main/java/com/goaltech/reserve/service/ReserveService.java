package com.goaltech.reserve.service;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;
import java.util.List;

public interface ReserveService {

	public List<Long> findPeriodDays();
	public GroundRuntimeResponseVO selectByRuntime();
	public void insertReservation();
}
