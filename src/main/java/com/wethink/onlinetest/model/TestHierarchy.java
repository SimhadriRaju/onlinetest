package com.wethink.onlinetest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TestHierarchy {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TH_SEQ")
	@SequenceGenerator(sequenceName = "TH_seq", initialValue = 1, allocationSize = 1, name = "TH_SEQ")
	Long id;
	private String parent;
	private String child;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

}
