package com.example.demo.view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public interface UserIO {
	public int inputMenuChoice(String prompt);
	public LocalDate inputOrderDate(String prompt);
	public Integer inputOrderNumber(String prompt);
	public String inputCustomerName (String prompt);
	public String inputState(String prompt);
	public String inputProductType (String prompt);
	public BigDecimal inputArea(String prompt);
	public String inputYesNo (String prompt);
}
