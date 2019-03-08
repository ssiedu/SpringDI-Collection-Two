package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private int code;
	private String cname;
	private String email;
	private List<Address> addresses;
	
	
	public void showInfo(){
		System.out.println("Code    : "+code);
		System.out.println("Name    : "+cname);
		System.out.println("Email   : "+email);
		System.out.println("Addresses : ");
		System.out.println(addresses);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
}
