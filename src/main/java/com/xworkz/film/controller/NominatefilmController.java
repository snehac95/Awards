package com.xworkz.film.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.film.dao.NominateDAO;
import com.xworkz.film.dto.NominateDTO;
import com.xworkz.film.entity.NominateEntity;
import com.xworkz.film.service.NaminateService;

@Controller
@RequestMapping("/")
public class NominatefilmController {
	@Autowired
	private NaminateService nominateService;
	@Autowired
	private NominateDAO nominateDAO;
	
	public NominatefilmController() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("Save.do")
	public String onSubmit(NominateDTO nominateDTO,NominateEntity nominateEntity,ModelMap map) {
		try {
			System.out.println("invoked onSave");
			//boolean check = this.nominateService.validateAndSave(nominateDTO);
			//if (check) {
				//map.addAttribute("Nominatefilm.jsp", "Data saved");
			//} else {
				//map.addAttribute("Nominatefilm.jsp", "Data not saved");
			//}
			
			Serializable k = this.nominateDAO.save(nominateEntity);
			System.out.println(nominateDTO);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/Nominatefilm.jsp";
	}	
}



