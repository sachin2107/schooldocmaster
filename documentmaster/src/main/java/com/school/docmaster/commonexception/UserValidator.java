package com.school.docmaster.commonexception;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.school.docmaster.model.Student;
import com.school.docmaster.model.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if (user.getEmail() == null || user.getEmail().equals("2107sachin@gmail.com")) {
			errors.rejectValue("hint", null, "Please select a file to upload!");
			return;
		}
	}

}
