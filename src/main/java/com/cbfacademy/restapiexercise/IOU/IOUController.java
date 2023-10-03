package com.cbfacademy.restapiexercise;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOUController {

	@GetMapping(value="/",produces = MediaType.APPLICATION_JSON_VALUE)
	public IOU Ping() {
		IOU transaction = new IOU ("Bob", "Mary", new BigDecimal("25.52"), Instant.now());
		return transaction;
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}

}
