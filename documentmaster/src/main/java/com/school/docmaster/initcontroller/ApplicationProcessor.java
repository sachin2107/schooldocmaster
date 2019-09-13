package com.school.docmaster.initcontroller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.school.docmaster.common.model.ReferenceDataElement;
import com.school.docmaster.common.service.ReferenceDataElementService;

@Component
public abstract class ApplicationProcessor {

	@Autowired
	public ReferenceDataElementService referenceDataService;
	
	@Autowired
	public ServletContext context;
	
	public ServletContext getContext() {
		return context;
	}

	@PostConstruct
	public void init()
	{
		createReferenceData();
	}
	
	private ServletContext createReferenceData()
	{
		this.context.setAttribute("refDataBean", this.getRefDataMap());
		this.context.setAttribute("firstName", "Sachin");
		return this.context;
	}
	
	private Map<String,Map<String,String>> getRefDataMap()
	{
		Map<String,String> codeDesc = new HashMap<>();
		Map<String,Map<String,String>> finalMap = new HashMap<>();
		List<ReferenceDataElement> refData = this.referenceDataService.getRefDataElements();
		Iterator itr = refData.iterator();
		while(itr.hasNext())
		{
			ReferenceDataElement rde = (ReferenceDataElement)itr.next();
			codeDesc.put(rde.getElementCode(), rde.getElementDesc());
		}
		finalMap.put("ip_cntry", codeDesc);
		return finalMap;
	}
	
}
