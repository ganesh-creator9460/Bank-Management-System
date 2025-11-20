package com.bankmanagement.serviceImpl;
 
import java.util.Scanner;
import com.bankmanagement.model.Account;
import com.bankmanagement.service.Rbi;
import com.exception.Balance_Not_Valid;
import com.exception.Invalid_Age;


public class Sbi implements Rbi
{
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	
	@Override
	public void createAccount() throws Invalid_Age,Balance_Not_Valid{
		
		System.out.println("=====Create Account=====");
		
		System.out.print("Enter Account Number : ");
		ac.setAccNo(sc.nextInt());
		
		System.out.print("Enter AccountHolder Name :");
		ac.setName(sc.next());
		
		System.out.print("Enter Mobile No : ");
		ac.setMobNo(sc.next());
		
		System.out.print("Enter Adhar No : ");
		ac.setAdharNo(sc.next());
		
		System.out.print("Enter Gender : ");
		ac.setGender(sc.next());
		
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		if(age>=18 && age<=75)
		{
			ac.setAge(age);
		}
		else
		{
			throw new Invalid_Age("Age is not Valid for Create Accout");
		}
		
		System.out.print("Enter Balance : ");
		int balance=sc.nextInt();
		if(balance>=500)
		{
			ac.setBalance(balance);	
		}		
		else
		{
			throw new Balance_Not_Valid("Your Account is not Created! \t Balance is Greater than or equal to Five Hundred");
		}
	}

	@Override
	public void displayAllDetails() {
		
		System.out.println("=====All Details=====");
		
		System.out.println("Account Number : "+ac.getAccNo());
		System.out.println("Account Name : "+ac.getName());
		System.out.println("Mobile No : "+ac.getMobNo());
		System.out.println("Adhar No : "+ac.getAdharNo());
		System.out.println("Gender : "+ac.getGender());
		System.out.println("Age : "+ac.getAge());
		System.out.println("Balance : "+ac.getBalance());
	}

	@Override
	public void depositeMoney() {
		
		System.out.println("=====Deposite Money=====");
		
		System.out.print("Enter Account Number : ");
		int account = sc.nextInt();

		if(account==ac.getAccNo())
		{
			System.out.print("Enter Deposite Amount : ");
			int deposite = sc.nextInt();
			
			ac.setBalance(ac.getBalance()+deposite);
			System.out.println("Balance After Deposite : "+ac.getBalance());
			
		}
		else
		{
			System.out.println("Oops! Wrong Account Number");
		}
		
	}
	
	@Override
	public void withdrawal() {
		
		System.out.println("=====Withdrawal=====");
		
		System.out.print("Enter Account Number : ");
		int account = sc.nextInt();
		
		if(account==ac.getAccNo())
		{
			System.out.print("Enter Withdrawal Amount : ");
			int withdrawal = sc.nextInt();
			
			if(withdrawal>0 && withdrawal<=ac.getBalance())
			{
				ac.setBalance(ac.getBalance()-withdrawal);
				System.out.println("Balance after Withdrawal : "+ac.getBalance());
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Oops! Wrong Account Number");
		}
	}
	
	@Override
	public void balanceCheck() {
		
		System.out.println("=====Check Balance=====");
		
		System.out.println("Balance : "+ac.getBalance());
	}
}