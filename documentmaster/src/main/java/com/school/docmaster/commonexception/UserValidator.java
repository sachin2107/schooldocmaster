package com.school.docmaster.commonexception;

import java.util.Map;

import org.springframework.validation.Errors;

import com.school.docmaster.model.User;

public class UserValidator extends AbstractValidator{


	@Override
	protected Class<?> getValidatorSuportClass() {
		return User.class;
	}

	@Override
	protected void validateRequiredFields(Object obj, Map<?,?> map, Errors errors) {
		User user = (User) obj;
		if (user.getEmail() == null || user.getEmail().equals("2107sachin@gmail.com")) {
			errors.rejectValue("hint", "hint.required", "Please select a file to upload!");
			return;
		}
	}
}
