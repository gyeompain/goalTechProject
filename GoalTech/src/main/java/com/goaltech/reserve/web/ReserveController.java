package com.goaltech.reserve.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goaltech.reserve.service.ReserveServiceImpl;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;

@Controller
@RequestMapping(value = "reservation")
public class ReserveController {
	
	@Autowired
	private ReserveServiceImpl reserveServiceImpl;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String showReservations(Model model) {
		// UTC로 오늘 날짜 가져오기
		List<Long> periodDays = reserveServiceImpl.findPeriodDays();
		GroundRuntimeResponseVO runtimeVO = reserveServiceImpl.selectByRuntime();
		model.addAttribute("periodDays", periodDays);
		model.addAttribute("runtimeVO", runtimeVO);
		return "com/reservation/list";
	}
	
	@RequestMapping(value = "/{id}.do", method = RequestMethod.GET)
	public String showReservationForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		return "com/reservation/form";
	}
	
	@RequestMapping(value = "/reserve.do", method = RequestMethod.POST)
	public String reserve() {
		// TDOO : 화면에서 선택한 날짜와 시간 가져오기
		// TODO : 예약하기
		reserveServiceImpl.insertReservation();
		return "redirect:list.do";
	}
}
