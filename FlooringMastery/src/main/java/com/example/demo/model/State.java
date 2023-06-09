package com.example.demo.model;

import java.math.BigDecimal;

public class State {
	private String stateAbbreviation;
	private String stateName;
	private BigDecimal taxRate;
	
	public State() {
		
	}
	
	public State(String stateAbbreviation, String stateName, BigDecimal taxRate) {
		super();
		this.stateAbbreviation = stateAbbreviation;
		this.stateName = stateName;
		this.taxRate = taxRate;
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		return "State [stateAbbreviation=" + stateAbbreviation + ", stateName=" + stateName + ", taxRate=" + taxRate + "]";
	}
	
	
}
