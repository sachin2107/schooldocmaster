package com.school.docmaster.initcontroller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		List refData = this.referenceDataService.getRefDataElements();
		this.context.setAttribute("refDataBean", refData);
		this.context.setAttribute("firstName", "Sachin");
		return this.context;
	}
}
