package com.school.docmaster.common.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="reference_data_element")
public class ReferenceDataElement implements Serializable{
	
	@Id
	@Column(name="ELEMENT_CODE")
	private String elementCode;
	@Id
	@Column(name="CATEGORY_CODE")
	private String categoryCode;
	
	@Column(name="ACTIVE_FLAG")
	private Character activeFlag;
	
	@Column(name="ELEMENT_DESC")
	private String elementDesc;
	
	@Column(name="ELEMENT_VALUE")
	private String elementValue;
	
	@Column(name="ORDER_SEQ")
	private Integer orderSeqence;
	
	@Column(name="ACTIVE_TIMESTAMP")
	private String activeTimestamp;
	
	@Column(name="EXPIRY_TIMESTAMP")
	private String expiryTimestamp;
	
	@Column(name="UPDATE_USER_ID")
	private String updateBy;
	
	@Column(name="UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;
	@Id
	@Column(name="LOCALE")
	private String locale;
	@Id
	@Column(name="CHANNEL_ID")
	private String channelId;
	
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

	public String getElementValue() {
		return elementValue;
	}

	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}

	public Integer getOrderSeqence() {
		return orderSeqence;
	}

	public void setOrderSeqence(Integer orderSeqence) {
		this.orderSeqence = orderSeqence;
	}

	public String getActiveTimestamp() {
		return activeTimestamp;
	}

	public void setActiveTimestamp(String activeTimestamp) {
		this.activeTimestamp = activeTimestamp;
	}

	public String getExpiryTimestamp() {
		return expiryTimestamp;
	}

	public void setExpiryTimestamp(String expiryTimestamp) {
		this.expiryTimestamp = expiryTimestamp;
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

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	
}
