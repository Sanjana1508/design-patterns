package com.BuilderPattern;

public class URLBuilder {
	
	private String protocol;
	private String host;
	private int port;
	private String path;
	private String paramName;
	private String paramOrder;
	
	public URLBuilder(String protocol,String host,int port,String path) {
		this.protocol=protocol;
		this.host=host;
		this.port=port;
		this.path=path;
	}

	public String getProtocol() {
		return protocol;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	public String getPath() {
		return path;
	}

	public String getParamName() {
		return paramName;
	}
	public String getParamOrder() {
		return paramOrder;
	}

	public URLBuilder setParamName(String paramName) {
		this.paramName=paramName;
		return this;
	}
	
	public URLBuilder setParamOrder(String paramOrder) {
		this.paramOrder=paramOrder;
		return this;
	}
	
	
	public URL build() {
		return new URL(this);
	}
	
}
