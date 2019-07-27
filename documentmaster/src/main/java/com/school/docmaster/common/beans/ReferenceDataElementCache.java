/*package com.school.docmaster.common.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.school.docmaster.common.model.ReferenceDataElement;
import com.school.docmaster.common.service.ReferenceDataElementService;

@Component("refDataBean")
public class ReferenceDataElementCache {

	@Autowired
	private ReferenceDataElementService refDataService; 

	private List<ReferenceDataElement> refDataElements = new ArrayList();
	@PostConstruct
	private void init() {
		String activeFlag = AppConstant.ACTIVE_FLAG;
		setAllRefDataElements(activeFlag);
	}
	
	public void setAllRefDataElements(String activeFlag)
	{
		refDataElements = this.refDataService.getRefDataElements();
		this.refData.put("roles", refDataElements);
		System.out.println(refDataElements);
	}
	
	public List<ReferenceDataElement> getRefDataElements()
	{
		return refDataElements;
	}

	private Map refData = new HashMap<>();
	
	public Map getRefData() {
		return refData;
	}

	public void setRefData(Map refData) {
		this.refData = refData;
	}
	
	
}
*/