package com.gk.demo.cc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("gk.poc")
public class MqConfiguration {

	private String username;
	private String password;
	private int port;
	private String virtualhost;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getVirtualhost() {
		return virtualhost;
	}
	public void setVirtualhost(String virtualhost) {
		this.virtualhost = virtualhost;
	}
	
	
}
