package com.xinlipinggu.dao;

import java.io.Serializable;
import java.util.Set;

import org.apache.struts.action.ActionForm;

public class User {
	private String username;
	private String password;
	private int uId;
	private Set<Answer> answers;
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
}
