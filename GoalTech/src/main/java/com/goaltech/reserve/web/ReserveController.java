package com.goaltech.reserve.web;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goaltech.login.vo.UserVO;
import com.goaltech.login.web.LoginController;
import com.goaltech.reserve.service.ReserveService;
import com.goaltech.reserve.vo.GroundRuntimeResponseVO;
import com.goaltech.reserve.vo.ReservationListVO;



@Controller
public class ReserveController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private ReserveService reserveService;
	
	
	@RequestMapping(value = "list.do", method = { RequestMethod.GET})
	public String showReservations(HttpServletRequest request, HttpServletResponse response, Model model)throws Exception {
		
		LocalDate now = LocalDate.now(); //현재시간
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");  //날짜포멧지정    
		String ground_id = request.getParameter("code");
		String today = now.format(formatter);
		
		ReservationListVO ReservationListVO = new ReservationListVO();
		ReservationListVO.setGround_id(ground_id);;
		ReservationListVO.setToday(today);;
		
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
