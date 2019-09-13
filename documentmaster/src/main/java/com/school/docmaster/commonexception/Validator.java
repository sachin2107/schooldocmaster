package com.school.docmaster.commonexception;

import java.util.Map;

import org.springframework.validation.Errors;

public interface Validator {

	boolean supports(Class<?> clazz);
	
	void validate(Object value, Map<?,?> map, Errors errors);
}
