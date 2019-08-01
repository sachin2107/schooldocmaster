package com.demo.onesd;

public class ClientProfile extends AbstractDataBean{

	private String clientKey;
	private Integer clientVersion;
	
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

	public AbstractPrimaryKey getPrimaryKey() {
		return new ClientProfileKey(this.clientKey, this.clientVersion);
	}

}
