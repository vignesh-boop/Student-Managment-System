package com.example_profiles.profiles;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private HumanClass humanClass;
	
	public Controller(HumanClass humanClass) {
		this.humanClass = humanClass;
	}
	@GetMapping("/names")
	public List<String> message() {
		return humanClass.names();
	}
}
