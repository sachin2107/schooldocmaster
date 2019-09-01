package com.school.docmaster.initcontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.school.docmaster.commonexception.UserValidator;
import com.school.docmaster.model.Result;
import com.school.docmaster.model.User;
import com.school.docmaster.repositories.UserRepository;

@Controller
@RequestMapping("/school")
public class InitController extends ApplicationProcessor {

	@Autowired
	private UserRepository userRepository;

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	protected final String className = getClass().getName();
	/*
	 * If you want to use log4j.properties file then use
	 * Logger.getLogger(InitController.class) this line
	 */
	private final Logger logger = Logger.getLogger(InitController.class);

//	If you want to use log4j.xml file then use LogFactory.getLog
//	protected final Log debugLogger = LogFactory.getLog("DEBUGGER"+this.className);

	@GetMapping(path = "/welcome")
	public ModelAndView home(final HttpServletRequest request, final HttpServletResponse response) {
		return new ModelAndView("welcome");
	}

	@GetMapping(path = "/login")
	public ModelAndView login(ModelMap model) {
		if (logger.isDebugEnabled())
			logger.debug("inside login method...");
		/*
		 * if(debugLogger.isDebugEnabled()) { debugLogger.debug("in hsbc logger..."); }
		 */
		Result result = new Result();
		User user = this.userRepository.getUsers();
		Map refData = (Map) this.context.getAttribute("refDataBean");
		result.setUser(user);
		model.addAttribute("result", result);
		model.addAttribute("refData", refData);
		return new ModelAndView("login", "command", user);
	}

	@PostMapping(path = "/login")
	public ModelAndView credentialLogin(@Valid @ModelAttribute("command") User userLogin, BindingResult results,
			ModelMap model) {
		if(userLogin.getHint().equals("firstname")) {
			new UserValidator().validate(userLogin, results);
		}
		if(results.hasErrors()) {
			model.addAttribute("message", "Validation fails for adding the product!");
			model.addAttribute("userClickManageProduct",true);
			return new ModelAndView("welcome");
		}
		model.addAttribute("a", "abcd");
		return new ModelAndView("login");
	}
}
