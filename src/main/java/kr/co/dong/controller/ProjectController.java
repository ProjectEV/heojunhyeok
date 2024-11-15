package kr.co.dong.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dong.board.ProjectService;

@Controller
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Inject
	ProjectService projectService;
	
	@RequestMapping(value ="product/login", method = RequestMethod.GET) 
	
	public String login() {
		return "login_2";
	}
	
	@RequestMapping(value ="product/login", method = RequestMethod.POST)
	public String login(@RequestParam Map<String,Object> map,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		request.setCharacterEncoding("UTF-8");
		Map<String, Object> user = projectService.login(map);
		
		if(user == null) {
			logger.info("로그인 실패");
			return "redirect:/product/login";
		}else {
			session.setAttribute("user", user);
			return "redirect:/";
		}
	}	
	
	
	
	
	
	
	
}
