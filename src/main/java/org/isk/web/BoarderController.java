package org.isk.web;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.ServletRequest;

import org.isk.domain.MemberVO;
import org.isk.persistence.MemberDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board/*")
public class BoarderController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoarderController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Inject 
	private MemberDAO memberDAO;

	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public void home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
	}
}
