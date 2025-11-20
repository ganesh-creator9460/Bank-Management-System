package com.bankmanagement.client;

import java.util.Scanner;

import com.bankmanagement.service.Rbi;

import com.bankmanagement.serviceImpl.Sbi;
import com.exception.Balance_Not_Valid;
import com.exception.Invalid_Age;

public class Test {

	public static void main(String[] args)throws Invalid_Age,Balance_Not_Valid {
		
		Rbi r = new Sbi();
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println();
			System.out.println("=========================================");
			System.out.println("   Welcome to Bank Management System");
			System.out.println("=========================================\n");
			
			System.out.println(" Main Menu ");
			System.out.println("=============");
			System.out.println("1.Create Account\n2.Display All Details\n3.Deposite Money\n4.Withdrawal\n5.Balance Check\n");
			System.out.print("Enter : ");
			int option = sc.nextInt();
			
			
			switch(option)
			
			{
				case 1:	r.createAccount();
				break;
				
				case 2: r.displayAllDetails();
				break;
				
				case 3: r.depositeMoney();
				break;
				
				case 4: r.withdrawal();
				break;
				
				case 5: r.balanceCheck();
				break;
				
				default : System.out.println("Invalid");
				
			}
			
			System.out.println();
			
		 }while(true);
	}
}
