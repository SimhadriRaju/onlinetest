package com.wethink.onlinetest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wethink.onlinetest.dto.QuestionDTO;
import com.wethink.onlinetest.dto.TestDTO;
import com.wethink.onlinetest.service.OnlineTestService;

@RestController
public class OnlineTestController {
	@Autowired
    private OnlineTestService service;
    
	@PostMapping("/question")
	public ResponseEntity<QuestionDTO> getQuestionByLevel(@RequestBody TestDTO body) {
		 
		return new ResponseEntity<QuestionDTO>(service.getQuestionByLevel(body), HttpStatus.OK);
	}
}
