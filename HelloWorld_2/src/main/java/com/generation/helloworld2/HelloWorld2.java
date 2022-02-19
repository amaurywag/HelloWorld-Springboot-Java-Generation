package com.generation.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Atividade 2 - Spring-boot (minha segunda aplicação):
Crie uma aplicação spring de hello world.

A aplicação deverá conter um end-point que retorna
uma string com os seus objetivos de aprendizagem para
essa semana. */

@RestController
@RequestMapping ("/hello2")
public class HelloWorld2 {
	@GetMapping
	public String hello2() {
		return "Hello, Generation! Temos como objetivos da semana, aprender como funciona o Spring Boot.";
	}
}
