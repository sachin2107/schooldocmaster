package com.school.docmaster.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@Column(name="EMAIL")
	private String email;
	@Column(name="USER_NAME_DESC")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="HINT")
	private String hint;
	@Column(name="HINT_ANSWER")
	private String hintAnswer;
	@Column(name="UPDATE_BY")
	private String updateBy;
	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimeStamp;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getHintAnswer() {
		return hintAnswer;
	}
	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Timestamp getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Timestamp updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	private int selectedIndex;

	public int getSelectedIndex() {
		return selectedIndex;
	}
	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}
	
}
