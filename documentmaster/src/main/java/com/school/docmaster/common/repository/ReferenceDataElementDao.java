package com.school.docmaster.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.school.docmaster.common.model.ReferenceDataElement;

public interface ReferenceDataElementDao {

	List<ReferenceDataElement> getRefDataElements();
	
}
