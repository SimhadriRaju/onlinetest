package com.wethink.onlinetest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class QuestionBank {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QB_SEQ")
	@SequenceGenerator(sequenceName = "qb_seq", initialValue = 1, allocationSize = 1, name = "QB_SEQ")
	Long id;
    private String primaryCode;
    private String questionType;
    private String question;
    private Integer ans;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrimaryCode() {
		return primaryCode;
	}
	public void setPrimaryCode(String primaryCode) {
		this.primaryCode = primaryCode;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Integer getAns() {
		return ans;
	}
	public void setAns(Integer ans) {
		this.ans = ans;
	}
}
