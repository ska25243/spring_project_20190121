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
@RequestMapping("/member/*")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Inject 
	private MemberDAO memberDAO;
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "index";
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberLogin(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "member/memberJoin";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String memberJoin(@RequestParam("email") String email, 
							 @RequestParam("password") String password,
							 @RequestParam("user_name") String user_name,
							 @RequestParam("id") String id,
							 Locale locale, Model model, MemberVO memberVO, RedirectAttributes rttr) {
		logger.info("Welcome home! The client locale is {}.", locale);
		System.out.println(email);
		System.out.println(password);
		System.out.println(user_name);
		System.out.println(id);
		memberVO.setEmail(email);
		memberVO.setPassword(password);
		memberVO.setUser_name(user_name);
		memberVO.setId(id);
		
		memberDAO.insertMember(memberVO);
		return "redirect:/";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String memberJoin(@RequestParam("id") String id, 
							 @RequestParam("password") String password,
							 Locale locale, Model model, MemberVO memberVO, RedirectAttributes rttr) {
		logger.info("Welcome home! The client locale is {}.", locale);
		memberVO.setPassword(password);
		memberVO.setId(id);
		
		int count = memberDAO.selectMember(memberVO);
		
		if(count>0){
			
			return "/board/boardList";
		}else{
			rttr.addFlashAttribute("message", "fail");
			return "redirect:/";
		}
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String memberUpdate(@RequestParam("id") String id, 
							 @RequestParam("password") String password,
							 @RequestParam("password_after") String password_after,
							 Locale locale, Model model, MemberVO memberVO, RedirectAttributes rttr) {
		logger.info("Welcome home! The client locale is {}.", locale);
		memberVO.setPassword(password);
		memberVO.setId(id);
		memberVO.setPassword_after(password_after);
		
		int count = memberDAO.updateMember(memberVO);
		
		if(count>0){
			
			return "/board/boardList";
		}else{
			rttr.addFlashAttribute("message", "fail");
			return "redirect:/";
		}
		
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String memberDelete(@RequestParam("id") String id, 
							 @RequestParam("password") String password,
							 Locale locale, Model model, MemberVO memberVO, RedirectAttributes rttr) {
		logger.info("Welcome home! The client locale is {}.", locale);
		memberVO.setPassword(password);
		memberVO.setId(id);
		
		int count = memberDAO.deleteMember(memberVO);
		System.out.println(count);
		if(count>0){
			
			return "/board/boardList";
		}else{
			rttr.addFlashAttribute("message", "fail");
			return "redirect:/";
		}
		
	}
}
