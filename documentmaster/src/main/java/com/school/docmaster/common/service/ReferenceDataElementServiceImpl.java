package com.school.docmaster.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.docmaster.common.model.ReferenceDataElement;
import com.school.docmaster.common.repository.ReferenceDataElementDao;

@Service
public class ReferenceDataElementServiceImpl implements ReferenceDataElementService {

	@Autowired
	private ReferenceDataElementDao referenceDataElementDao;
	
	public void setReferenceDataElementDao(ReferenceDataElementDao referenceDataElementDao) {
		this.referenceDataElementDao = referenceDataElementDao;
	}


	@Override
	public List<ReferenceDataElement> getRefDataElements() {
		List<ReferenceDataElement> refDataElements = this.referenceDataElementDao.getRefDataElements();
		return refDataElements;
	}

}
