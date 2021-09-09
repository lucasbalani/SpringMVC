package com.gestaoconvidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoconvidados.input.ConvidadoInput;
import com.gestaoconvidados.model.Convidado;
import com.gestaoconvidados.repository.ConvidadoRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		modelAndView.addObject("convidados", convidadoRepository.findAll());
		modelAndView.addObject(new Convidado());
		modelAndView.addObject("ConvidadoInput", new ConvidadoInput());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		
		this.convidadoRepository.save(convidado);
		return "redirect:/convidados";
	}
	
}
