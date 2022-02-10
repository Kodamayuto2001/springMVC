package com.yk.contact.model;

import lombok.Setter;
import lombok.Getter;

public class Contact {
	@Getter,@Setter
	private Interger id;

	@Getter,@Setter
	private String name;

	@Getter,@Setter
	private String email;

	@Getter,@Setter
	private String address;

	@Getter,@Setter
	private String phone;
}

