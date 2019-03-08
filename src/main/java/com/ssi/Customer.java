package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private int code;
	private String cname;
	private String email;
	private List<String> addresses;
	private Set<String> mobiles;
	private Map<String,String> family;
	private Properties phones;
	
	public void showInfo(){
		System.out.println("Code    : "+code);
		System.out.println("Name    : "+cname);
		System.out.println("Email   : "+email);
		System.out.println("Addresses : ");
		System.out.println(addresses);
		System.out.println("Mobiles : ");
		System.out.println(mobiles);
		System.out.println("Landline Phones : ");
		System.out.println(phones);
		/*for(String address:addresses){
			System.out.println(address);
		}
		System.out.println("Mobiles : ");
		for(String mobile:mobiles){
			System.out.println(mobile);
		}*/
		System.out.println("Family Members: ");
		System.out.println(family);
		System.out.println("___________________________________________");
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
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, String> getFamily() {
		return family;
	}
	public void setFamily(Map<String, String> family) {
		this.family = family;
	}
	public Properties getPhones() {
		return phones;
	}
	public void setPhones(Properties phones) {
		this.phones = phones;
	}
	
	
	
	
}
