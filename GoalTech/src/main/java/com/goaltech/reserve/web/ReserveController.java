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
	
	@RequestMapping(value = "list.do", method = RequestMethod.GET)
	public String showReservations(Model model) {
		// UTC濡� �삤�뒛 �궇吏� 媛��졇�삤湲�
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
		// TDOO : �솕硫댁뿉�꽌 �꽑�깮�븳 �궇吏쒖� �떆媛� 媛��졇�삤湲�
		// TODO : �삁�빟�븯湲�
		reserveServiceImpl.insertReservation();
		return "redirect:list.do";
	}
}
