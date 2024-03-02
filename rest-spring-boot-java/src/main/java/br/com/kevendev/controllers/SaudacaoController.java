package br.com.kevendev.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.kevendev.Saudacao;

@RestController
public class SaudacaoController {
	
	private static final String TEMPLATE = "Olá %s";
	private static final AtomicLong counter =new AtomicLong();

	@RequestMapping("/saudacao")
	public Saudacao saudacao(
			@RequestParam(value = "nome", defaultValue= "Mundo!") 
			String nome){
		return new Saudacao(counter.incrementAndGet(), String.format(TEMPLATE, nome));
	}
}
