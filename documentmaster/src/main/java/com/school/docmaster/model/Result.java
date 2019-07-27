package com.school.docmaster.model;

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
	
}
