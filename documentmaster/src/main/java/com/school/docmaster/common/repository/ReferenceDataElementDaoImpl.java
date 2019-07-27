package com.school.docmaster.common.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.school.docmaster.common.model.ReferenceDataElement;

@Repository
@Transactional
public class ReferenceDataElementDaoImpl implements ReferenceDataElementDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<ReferenceDataElement> getRefDataElements()
	{
		String query = "FROM ReferenceDataElement r";
		List<ReferenceDataElement> al = (List<ReferenceDataElement>) this.sessionFactory.getCurrentSession().createQuery(query).list();
		return al; 
	}
	
}
