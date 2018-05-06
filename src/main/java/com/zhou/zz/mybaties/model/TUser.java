package com.zhou.zz.mybaties.model;

public class TUser {
	// id 唯一属性
	private Integer id;

	// 登录id
	private String loginid;

	// 用户名
	private String username;

	// 角色
	private Role role;

	// 备注
	private String note;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "TUser [id=" + id + ", loginid=" + loginid + ", username=" + username + ", role=" + role + ", note="
				+ note + "]";
	}
}