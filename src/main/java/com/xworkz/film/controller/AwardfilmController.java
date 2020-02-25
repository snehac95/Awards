package com.xworkz.film.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import com.xworkz.film.dao.AwardDAO;
import com.xworkz.film.dto.AwardDTO;
import com.xworkz.film.entity.AwardEntity;
import com.xworkz.film.service.AwardService;

@Controller
@RequestMapping("/")
public class AwardfilmController {

	@Autowired
	private AwardService awardService;
	@Autowired
	private AwardDAO awardDAO;

	public AwardfilmController() {
		System.out.println("Created \t " + this.getClass().getSimpleName());
	}

	@RequestMapping("/Submit.do")
	public String onSubmit(AwardDTO awardDTO,AwardEntity awardEntity,ModelMap map) {
		try {
			System.out.println("invoked onSubmit");
			//boolean check = this.awardService.validateAndSave(awardDTO);
			//if (check) {
				//map.addAttribute("Awardfilm.jsp", "Data saved");
			//} else {
				//map.addAttribute("Awardfilm.jsp", "Data not saved");
			//}
			
			Serializable k = this.awardDAO.save(awardEntity);
			System.out.println(awardDTO);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/Awardfilm.jsp";

	}

}


