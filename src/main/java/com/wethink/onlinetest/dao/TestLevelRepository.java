package com.wethink.onlinetest.dao;

import org.springframework.data.repository.CrudRepository;

import com.wethink.onlinetest.model.QuestionBank;

public interface TestLevelRepository extends CrudRepository<QuestionBank, Long> {

}
