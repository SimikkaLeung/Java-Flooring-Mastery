package com.example.demo.view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Order;

public class OrderingView {

	private UserIO io;

	
	public OrderingView(UserIO io) {
		this.io = io;
	};

	
	public int displayMenu() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("* <<Flooring Program>> ");
		System.out.println("* 1. Display Orders ");
		System.out.println("* 2. Add an Order ");
		System.out.println("* 3. Edit an Order ");
		System.out.println("* 4. Remove an Order ");
		System.out.println("* 5. Export All Data ");
		System.out.println("* 6. Quit ");
		System.out.println("*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		
		
		return io.inputMenuChoice("What would you like to do? (1-6)");
	}
	public void displayOrders(List<Order> orderList) {
		
		if (orderList == null) {
			System.out.println("No order is found.");
		} else {
			for (Order order : orderList) {
				System.out.println(order);
			}	
		}		
	}
	public void displayOneOrder(Order order) {
		System.out.println(order);	
	}
	
	
	public void displayGoodbyeMessage() {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("* Thank you for visiting our store! We hope to serve you again!");
		System.out.println("*");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
	}
	
	public void displayErrorMessage(String prompt) {
		System.out.println(prompt);

	}
	
	public LocalDate inputOrderDate(String prompt) {
		return io.inputOrderDate(prompt);
	}
	public Integer inputOrderNumber(String prompt) {
		return io.inputOrderNumber(prompt);
	}
	public String inputCustomerName (String prompt) {
		return io.inputCustomerName(prompt);
	}
	public String inputState(String prompt) {
		return io.inputState(prompt);
	}
	public String inputProductType (String prompt) {
		return io.inputProductType(prompt);
	}
	public BigDecimal inputArea(String prompt) {
		return io.inputArea(prompt);
	}
	public String inputYesNo (String prompt) {
		return io.inputYesNo(prompt);
	}
	
	public String displayCustomerName(Order order) {
		return order.getCustomerName();
	}
	public String displayState(Order order) {
		return order.getStateAbbreviation();
	}
	public String displayProductType(Order order) {
		return order.getProductType();
	}
	public String displayArea(Order order) {
		return order.getArea().toString();
	}
	
}
