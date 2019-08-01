package com.demo.onesd;

import java.io.Serializable;

public class ClientProfileKey extends AbstractPrimaryKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clientKey;
	private Integer clientVersion;
	
	public ClientProfileKey(final String clientKey, final Integer clientVersion)
	{
		super();
		this.clientKey = clientKey;
		this.clientVersion =clientVersion;
	}
	public String getClientKey() {
		return clientKey;
	}
	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}
	public Integer getClientVersion() {
		return clientVersion;
	}
	public void setClientVersion(Integer clientVersion) {
		this.clientVersion = clientVersion;
	}
	@Override
	public String toString() {
		return "clientKey="+clientKey + "||clientVersion=" + clientVersion;
	}
	
}
