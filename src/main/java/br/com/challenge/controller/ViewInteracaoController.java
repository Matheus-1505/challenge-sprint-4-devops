package br.com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import br.com.challenge.model.dto.ViewInteracaoRepository;
import br.com.challenge.model.entity.ViewInteracao;


@RestController
@RequestMapping("/viewinteracao")
public class ViewInteracaoController {
	
	@Autowired
	private ViewInteracaoRepository viewInteracaoRepository;
	
	@GetMapping
	public ModelAndView viewinteracao() {
		
		List<ViewInteracao> viewInteracoes = viewInteracaoRepository.findAll();
		ModelAndView mv = new ModelAndView("viewinteracao");
		mv.addObject("viewInteracoes", viewInteracoes);
		return mv;
	}
	

}