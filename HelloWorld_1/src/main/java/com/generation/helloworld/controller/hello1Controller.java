package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello1")

/*Atividade 1 - Spring-boot (minha primeira aplicação): Crie uma aplicação spring de hello world.

A aplicação deverá conter um end-point que retorna uma string com as habilidades
e mentalidades que você utilizou para rea	lizar essa atividade. */

public class hello1Controller {
	@GetMapping
	public String hello1() {
		return "Hello, Generation! Para realizar o desenvolvimento desta atividade utilizei a mentali"
				+ "dade de persistência e a habilidade de orientação aos detalhes.";
	}
}
