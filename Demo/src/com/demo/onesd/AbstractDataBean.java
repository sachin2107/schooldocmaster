package com.demo.onesd;

public abstract class AbstractDataBean {

	private boolean isNew = false;
	private boolean isModified = false;
	
	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public boolean isModified() {
		return isModified;
	}

	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}

	public abstract AbstractPrimaryKey getPrimaryKey();
}
