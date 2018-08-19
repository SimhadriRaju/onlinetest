package com.wethink.onlinetest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wethink.onlinetest.dto.TestDTO;

public class TestController {
	
	public ResponseEntity<List<TestDTO>> getTests() {
		List<TestDTO> list ;
		System.out.println("test comment");
		return null ;// ResponseEntity<List<TestDTO>>()
		
	}

}
