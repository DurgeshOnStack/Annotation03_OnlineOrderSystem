package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("or")
public class Order {
private int orderId;
private Customer customer;
private Product product;
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
@Autowired
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Autowired
public void setProduct(Product product) {
	this.product = product;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", customer=" + customer + ", product=" + product + "]";
}

}
