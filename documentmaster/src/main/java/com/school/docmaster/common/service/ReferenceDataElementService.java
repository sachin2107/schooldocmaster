package com.school.docmaster.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.docmaster.common.model.ReferenceDataElement;

public interface ReferenceDataElementService {
	
	List<ReferenceDataElement> getRefDataElements();
}
