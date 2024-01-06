package com.webapplms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webapplms1Controller {
	@GetMapping(path="last")
	public String getmsg() {
		return "Namba Jeichitom Maara";
	}

}
