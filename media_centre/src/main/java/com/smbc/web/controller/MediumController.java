package com.smbc.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smbc.dto.MediumDTO;
import com.smbc.model.Medium;
import com.smbc.service.MediumService;

@Controller
public class MediumController {

	@Autowired
	private MediumService mediumService;

	@RequestMapping(value = "/medium", method = RequestMethod.GET)
	public ModelAndView printBooks(ModelAndView model) {
		List<Medium> listMedium = mediumService.getAllMediums();
		model.addObject("listMedium", listMedium);

		return model;
	}

	@RequestMapping(value = "/newMedium", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		MediumDTO medium = new MediumDTO();
		model.addObject("medium", medium);
		model.setViewName("MediumForm");
		return model;
	}

	@RequestMapping(value = "/saveMedium", method = RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Medium medium, ModelAndView model) {
		mediumService.addMedium(medium);
		return new ModelAndView("redirect:/medium");
	}

}

