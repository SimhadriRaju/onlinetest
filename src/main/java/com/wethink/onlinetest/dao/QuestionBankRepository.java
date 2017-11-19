package com.wethink.onlinetest.dao;

import org.springframework.data.repository.CrudRepository;

import com.wethink.onlinetest.model.QuestionBank;

public interface QuestionBankRepository extends CrudRepository<QuestionBank, Long>{

	public QuestionBank findByPrimaryCode(String primaryCode);
	public QuestionBank findById(Long id);

}
