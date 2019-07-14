package com.school.docmaster.initcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.school.docmaster.model.User;

@Controller
@RequestMapping("/school")
public class InitController {
	protected final String className = getClass().getName();
	/*If you want to use log4j.properties file then use Logger.getLogger(InitController.class) this line*/
	private final Logger logger = Logger.getLogger(InitController.class);
	
//	If you want to use log4j.xml file then use LogFactory.getLog
//	protected final Log debugLogger = LogFactory.getLog("DEBUGGER"+this.className);
	
	@GetMapping(path="/welcome")
	public ModelAndView home(final HttpServletRequest request, final HttpServletResponse response)
	{
		return new ModelAndView("welcome");
	}
	
	@GetMapping(path="/login")
	public ModelAndView login(ModelMap model)
	{	
		if(logger.isDebugEnabled())
			logger.debug("inside login method...");
		/*if(debugLogger.isDebugEnabled())
		{
			debugLogger.debug("in hsbc logger...");
		}*/
		return new ModelAndView("login","command",new User());
	}
	
	@PostMapping(path="/login")
	public ModelAndView credentialLogin(@ModelAttribute("command") User userLogin, ModelMap model)
	{
		model.addAttribute("a","abcd");
		return new ModelAndView("login");
	}
}
