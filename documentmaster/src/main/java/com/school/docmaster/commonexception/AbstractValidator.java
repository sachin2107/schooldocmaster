package com.school.docmaster.commonexception;

import java.util.Map;

import org.springframework.validation.Errors;

public abstract class AbstractValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(getValidatorSuportClass());
	}

	@Override
	public void validate(Object obj, Map<?,?> map, Errors errors) {
		boolean isObjectSupportedByValidator = supports(obj.getClass());
		if(isObjectSupportedByValidator) {
			validateRequiredFields(obj, map, errors);
		}
	}
	
	protected abstract Class<?> getValidatorSuportClass();
	
	protected abstract void validateRequiredFields(Object obj, Map<?,?> map, Errors errors);

}
