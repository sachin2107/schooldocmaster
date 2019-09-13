package com.school.docmaster.initcontroller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.school.docmaster.commonexception.UserValidator;
import com.school.docmaster.model.User;

@Controller
@RequestMapping("/school/creds")
public class LoginController extends ApplicationProcessor{

	/*@PostMapping(path="/login")
	public ModelAndView credentialLogin(@ModelAttribute("command") User userLogin, ModelMap model, HttpServletRequest req)
	{
		model.addAttribute("a","abcd");
		return new ModelAndView("login");
	}*/
	@PostMapping(path = "/login")
	public ModelAndView credentialLogin(@Valid @ModelAttribute("command") User userLogin, BindingResult results,
			ModelMap model) {
		if(userLogin.getHint().equals("GER")) {
			new UserValidator().validate(userLogin,new HashMap<>(), results);
		}
		if(results.hasErrors()) {
			model.addAttribute("message", "Validation fails for adding the product!");
			return new ModelAndView("login","command", userLogin);
		}
		model.addAttribute("a", "abcd");
		return new ModelAndView("login");
	}
}
