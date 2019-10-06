package com.school.docmaster.model;

import java.util.ArrayList;
import java.util.List;

import com.school.docmaster.common.model.ReferenceDataElement;

public class Result {

	private User user;
	private ReferenceDataElement refDataElement;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ReferenceDataElement getRefDataElement() {
		return refDataElement;
	}
	public void setRefDataElement(ReferenceDataElement refDataElement) {
		this.refDataElement = refDataElement;
	}
	
	private List<Student> students = new ArrayList<>();
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	private Integer studentSelectedIndex;
	public Integer getStudentSelectedIndex() {
		return studentSelectedIndex;
	}
	public void setStudentSelectedIndex(Integer studentSelectedIndex) {
		this.studentSelectedIndex = studentSelectedIndex;
	}
	
}
