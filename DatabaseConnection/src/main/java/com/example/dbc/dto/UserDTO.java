package com.example.dbc.dto;

public class UserDTO {
	private int userid;
	private String username;
	private String email;
	private String mobileno;
	private String password;
	private int age;
	public UserDTO() {}
	
	public UserDTO(int userid, String username, String email, String mobileno, String password, int age) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.mobileno = mobileno;
		this.password = password;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", username=" + username + ", email=" + email + ", mobileno=" + mobileno
				+ ", password=" + password + ", age=" + age + "]";
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
