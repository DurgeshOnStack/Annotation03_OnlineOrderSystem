package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pro")
public class Product {
private String productName;
private double price;
public void setProductName(String productName) {
	this.productName = productName;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productName=" + productName + ", price=" + price + "]";
}

}
