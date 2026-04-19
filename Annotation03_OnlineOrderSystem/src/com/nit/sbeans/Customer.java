package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("cus")
public class Customer {
private String name;
private String email;
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}

}
