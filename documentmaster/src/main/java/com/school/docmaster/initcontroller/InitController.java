package com.school.docmaster.initcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/school")
public class InitController {

	protected final String CLASS_NAME = getClass().getName();
//	If you want to use log4j.properties file then use Logger.getLogger(InitController.class) this line
//	private final Logger logger = Logger.getLogger(InitController.class);
	
//	If you want to use log4j.xml file then use LogFactory.getLog
	private final Log debugLogger = LogFactory.getLog("DEBUGGER"+this.CLASS_NAME);
	@RequestMapping(value="/welcome")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response)throws Exception
	{
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response)throws Exception
	{	
//		if(logger.isDebugEnabled())
//			logger.debug("inside login method...");
		if(debugLogger.isDebugEnabled())
			debugLogger.debug("in hsbc logger...");
		return new ModelAndView("login");
	}
}
