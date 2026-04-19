package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Customer;
import com.nit.sbeans.Order;
import com.nit.sbeans.Product;

public class TestOrder {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
	Customer customer=ctx.getBean("cus",Customer.class);
	customer.setName("Pawan");
	customer.setEmail("pawan@gmail.com");
	Product product=ctx.getBean("pro", Product.class);
	product.setProductName("Laptop");
	product.setPrice(70000);
	Order order=ctx.getBean("or",Order.class);
	order.setOrderId(101);
	System.out.println(order.toString());
	
}
}
