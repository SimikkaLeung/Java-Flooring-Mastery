package com.example.demo.view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.example.demo.exception.EmptyInputException;

public class UserIOConsoleImpl implements UserIO {
	
	/*
	 * This class only checks if the data type is valid. 
	 * More data validation will be done in the service class.
	 */
	private Scanner keyboard = new Scanner(System.in);
	
	@Override
	public int inputMenuChoice(String prompt) {

		System.out.println(prompt);
		int choice = 0;
		boolean toContinue = true;
		
		do {
			
			try {
				String strChoice = keyboard.nextLine();
				choice = Integer.parseInt(strChoice);
				toContinue = false;
			} catch (NumberFormatException ex) {
				System.out.println("Please provide a valid response.");
				toContinue = true;
			}
			
		} while (toContinue);
		
		return choice;
	}
	
	@Override
	public LocalDate inputOrderDate(String prompt) {
		
		System.out.println(prompt);
		LocalDate orderDate = null;
		boolean toContinue = true;
		
		do {
			try {
				orderDate = LocalDate.parse(keyboard.nextLine());
				toContinue = false;
			} catch (DateTimeParseException ex) {
				System.out.println("Please provide a valid response.");
				toContinue = true;
			}
			
		} while (toContinue);
		
		return orderDate;
	}
	
	
	@Override
	public Integer inputOrderNumber(String prompt) {

		System.out.println(prompt);
		String strOrderNumber = keyboard.nextLine();
		int orderNumber = 0;
		boolean toContinue = true;
		
		do {

			try {
				if (strOrderNumber == null || strOrderNumber.length() == 0 ) {
					throw new EmptyInputException();
				}
				orderNumber = Integer.parseInt(strOrderNumber);
				toContinue = false;
			} catch (ArithmeticException | EmptyInputException ex1) {
				System.out.println("Please provide a valid response.");
				toContinue = true;
			}
			
		} while (toContinue);
		
		return orderNumber;
	}

	@Override
	public String inputCustomerName(String prompt) {

		System.out.println(prompt);
		String input = keyboard.nextLine();
		
		return input;
	}

	@Override
	public String inputState(String prompt) {

		System.out.println(prompt);
		String input = keyboard.nextLine();
		
		return input;
	}

	@Override
	public String inputProductType(String prompt) {

		System.out.println(prompt);
		String input = keyboard.nextLine();
		
		return input;
	}

	@Override
	public BigDecimal inputArea(String prompt) {

		System.out.println(prompt);
		
		BigDecimal area = null;
		boolean toContinue = true;
		String strArea = null;
		do {
			strArea = keyboard.nextLine();
			if (strArea.length()==0 || strArea == null) {
				
				return null;
			}
			try {

				area = new BigDecimal(strArea);
				toContinue = false;
			} catch (NumberFormatException ex) {
				System.out.println("Please provide a valid response.");
				toContinue = true;
			}
			
		} while (toContinue);
		
		return area;
	}

	@Override
	public String inputYesNo(String prompt) {

		System.out.println(prompt);
		String input = keyboard.nextLine();
		
		return input;
	}

}
