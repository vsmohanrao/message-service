package com.mu.microservices.message.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping(value = "/message/{name}", produces = "application/json")
	public String welcomeMesssage(@PathVariable String name) {
		return new StringBuilder("Hello ")
				.append(name)
				.append(", welcome to Microservices Session")
				.toString();
	}
}
