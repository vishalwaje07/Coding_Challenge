package com.validate.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "User name can not be blank")
	@Size(min = 3, max = 12, message = "User name must be in 3 -12 ")
	private String userName;

	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
