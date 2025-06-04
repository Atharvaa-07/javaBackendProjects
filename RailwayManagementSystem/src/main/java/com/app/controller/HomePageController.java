package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/railway")
public class HomePageController {
	
	public HomePageController() {
		System.out.println("in home page ctor");
	}
	
	@GetMapping("/")
	public List<Integer> getNumberedList(){
		System.out.println("in numberList");
		return Arrays.asList(10,20,30,40);
	}

}
