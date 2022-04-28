package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
	@GetMapping
    public String hello() {
        return "Hello World!!!";
}
	@GetMapping ("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistência <br /> Trabalho em equipe <br /> Atenção ao detalhe <br /> Orientação ao futuro <br /> Responsabilidade Pessoal <br /> Mentalidade de Crescimento <br /> Proatividade ";
	}
}
