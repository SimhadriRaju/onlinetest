package com.wethink.onlinetest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,  generator="TEST_SEQ")
    @SequenceGenerator(allocationSize=1, initialValue=20, name="TEST_SEQ", sequenceName="test_seq")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String testLevel;
	private String primaryCode;

	public String getTestLevel() {
		return testLevel;
	}

	public void setTestLevel(String testLevel) {
		this.testLevel = testLevel;
	}

	public String getPrimaryCode() {
		return primaryCode;
	}

	public void setPrimaryCode(String primaryCode) {
		this.primaryCode = primaryCode;
	}
}
