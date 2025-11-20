package com.bankmanagement.service;

import com.exception.Balance_Not_Valid;
import com.exception.Invalid_Age;

public interface Rbi {

	public void createAccount() throws Invalid_Age,Balance_Not_Valid;
	public void displayAllDetails();
	public void depositeMoney();
	public void withdrawal() ;
	public void balanceCheck();
	
}