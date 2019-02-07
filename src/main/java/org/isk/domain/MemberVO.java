package org.isk.domain;

public class MemberVO {
	
	private String id;
	private String password;
	private String email;
	private String user_name;
	private String password_after;
	
	public String getPassword_after() {
		return password_after;
	}
	public void setPassword_after(String password_after) {
		this.password_after = password_after;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String username) {
		this.user_name = username;
	}
}
