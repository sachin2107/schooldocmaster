package com.school.docmaster.common.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reference_data_element")
public class ReferenceDataElement {
	
	@Id
	@Column(name="ELEMENT_CODE")
	private String elementCode;
	
	@Column(name="CATEGORY_CODE")
	private String categoryCode;
	
	@Column(name="ACTIVE_FLAG")
	private Character activeFlag;
	
	@Column(name="ELEMENT_DESC")
	private String elementDesc;
	
	@Column(name="ELEMENT_VALUE")
	private String elementValue;
	
	@Column(name="UPDATE_USER_ID")
	private String updateBy;
	
	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;
	
	@Column(name="LOCALE")
	private String locale;
	
	@Column(name="CREATED_USER_ID")
	private String createdBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createTimestamp;
	
	public String getElementCode() {
		return elementCode;
	}
	public void setElementCode(String elementCode) {
		this.elementCode = elementCode;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	public Character getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getElementDesc() {
		return elementDesc;
	}
	public void setElementDesc(String elementDesc) {
		this.elementDesc = elementDesc;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}
	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public String getElementValue() {
		return elementValue;
	}
	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}
	
}
