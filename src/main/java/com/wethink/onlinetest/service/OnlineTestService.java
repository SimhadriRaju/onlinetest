package com.wethink.onlinetest.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wethink.onlinetest.dao.QuestionBankRepository;
import com.wethink.onlinetest.dto.QuestionDTO;
import com.wethink.onlinetest.dto.TestDTO;
import com.wethink.onlinetest.model.QuestionBank;

@Component
public class OnlineTestService {

	@Autowired
	QuestionBankRepository qbankRepository;
	
	public QuestionDTO getQuestionByLevel(TestDTO testDTO) {
		QuestionBank qb = qbankRepository.findById(testDTO.getId());
				//findByPrimaryCode(testDTO.getPrimaryCode());
		ModelMapper modelMapper = new ModelMapper();
		QuestionDTO  dto = modelMapper.map(qb, QuestionDTO.class);
		return dto;
	}
}
