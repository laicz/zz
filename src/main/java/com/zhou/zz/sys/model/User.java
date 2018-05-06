package com.zhou.zz.sys.model;

import java.io.Serializable;

public class User implements Serializable {

	private String loginname;

	private String username;

	private String password;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

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

	@Override
	public String toString() {
		return "User [loginname=" + loginname + ", username=" + username + ", password=" + password + "]";
	}

}
