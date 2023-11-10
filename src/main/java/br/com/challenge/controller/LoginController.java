package br.com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.challenge.model.dto.LoginRepository;
import br.com.challenge.model.entity.Login;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@GetMapping
	public ModelAndView login() {
		
		List<Login> logins = loginRepository.findAll();
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("logins", logins);
		return mv;
	}
	

}
