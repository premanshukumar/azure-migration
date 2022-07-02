package com.kgpco.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MigrationController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hey There! welcome to webapp azure world!!";
	}

}
