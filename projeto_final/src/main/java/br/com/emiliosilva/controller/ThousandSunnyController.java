package br.com.emiliosilva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ThousandSunnyController {
	@GetMapping
	public String thousandSunny() {
		return "thousandSunny";
	}
}
