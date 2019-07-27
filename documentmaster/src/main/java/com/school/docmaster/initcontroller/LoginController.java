package com.school.docmaster.initcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.school.docmaster.model.User;

@Controller
@RequestMapping("/school/creds")
public class LoginController extends ApplicationProcessor{

	@PostMapping(path="/login")
	public ModelAndView credentialLogin(@ModelAttribute("command") User userLogin, ModelMap model, HttpServletRequest req)
	{
		model.addAttribute("a","abcd");
		return new ModelAndView("login");
	}
}
