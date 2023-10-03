package com.cbfacademy.restapiexercise;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOUController {
	
	@GetMapping("/")
	public String ping() {
		return String.format("Service running successfully "+Instant.now().toString());
	}

	@GetMapping(value="/iou",produces = MediaType.APPLICATION_JSON_VALUE)
	public IOU getIOUs() {
		IOU transaction = new IOU ("Bob", "Mary", new BigDecimal("25.52"), Instant.now());
		return transaction;
	}

}
