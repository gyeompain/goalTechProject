package com.goaltech.reserve.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goaltech.login.web.LoginController;
import com.goaltech.reserve.service.ReserveService;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;



@Controller
public class ReserveController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private ReserveService reserveService;
	
	
	@RequestMapping(value = "list.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String showReservations(Model model)throws Exception {
		List<Long> periodDays = reserveService.findPeriodDays();
		GroundRuntimeResponseVO runtimeVO = reserveService.selectByRuntime();
		model.addAttribute("periodDays", periodDays);
		model.addAttribute("runtimeVO", runtimeVO);
		return "com/reservation/list";
	}
    
	@RequestMapping(value = "{id}.do", method = RequestMethod.GET)
	public String showReservationForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("id", id);
		return "com/reservation/form";
	}
	
	@RequestMapping(value = "reserve.do", method = RequestMethod.POST)
	public String reserve() {
		reserveService.insertReservation();
		return "redirect:list.do";
	}
}
