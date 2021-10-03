package com.BuilderPattern;

public class URL {

	//required
	private String protocol;
	private String host;
	private int port;
	private String path;
	
	//optional
	private String paramName;
	private String paramOrder;
	
	public URL(URLBuilder builder) {
		this.protocol=builder.getProtocol();
		this.host=builder.getHost();
		this.port=builder.getPort();
		this.path=builder.getPath();
		this.paramName=builder.getParamName();
		this.paramOrder=builder.getParamOrder();
		
	}

	@Override
	public String toString() {
		return "URL [protocol=" + protocol + ", host=" + host + ", port=" + port + ", path=" + path + ", paramName="
				+ paramName + ", paramOrder=" + paramOrder + "]";
	}
	
	
}
