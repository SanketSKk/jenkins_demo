package com.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	
	@GetMapping("/v1/jenkins-data")
	public ResponseEntity<String> getName() {
		System.out.println("inside data");
				System.out.println("sample");


		return new ResponseEntity<>("Jenkins is Configure and its working", HttpStatus.OK);
	}

}
