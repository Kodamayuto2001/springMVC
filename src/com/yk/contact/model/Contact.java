package com.yk.contact.model;

//import lombok.Setter;
//import lombok.Getter;

//public class Contact {
//	@Getter,@Setter
//	private Interger id;
//
//	@Getter,@Setter
//	private String name;
//
//	@Getter,@Setter
//	private String email;
//
//	@Getter,@Setter
//	private String address;
//
//	@Getter,@Setter
//	private String phone;
//}


public class Contact {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private String phone;

	protected Contact(Integer id, String name, String email, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
