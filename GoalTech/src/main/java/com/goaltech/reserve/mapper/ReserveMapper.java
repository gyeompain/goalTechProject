package com.goaltech.reserve.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.goaltech.reserve.vo.GroundRuntimeResponseVO;
import com.goaltech.reserve.vo.ReservationListVO;
import com.goaltech.reserve.vo.ReservationRequestVO;

@Mapper
public interface ReserveMapper {

	public void insertReservation(ReservationRequestVO requestVO);
	public GroundRuntimeResponseVO selectByRuntime(Long ground_code);
	public ReservationListVO selectByList(String ground_id, String today);
}
