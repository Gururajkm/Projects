package com.Qac.Fruits.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Qac.Fruits.BusinessLogic.BusinessLogic;
import com.Qac.Fruits.dto.Details;
import com.anita.LookIt.dto.Register;

@Controller
public class Test {
	@Autowired
	  private BusinessLogic service;
	
	  @RequestMapping(value="/index", method=RequestMethod.POST)
	   public ModelAndView  save(Details details) {
		ModelAndView modelAndView =new ModelAndView();
		String msg = service.validateandSave(details);
		System.out.println(msg);
		modelAndView.addObject("responsemsg", msg);
		modelAndView.setViewName("/Home.jsp");
		return modelAndView;
		
	
		
	}
	

}
