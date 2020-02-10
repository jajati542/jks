package com.icici.loans.homeloan.carloan;

public class Hdfc implements Rbi

{

	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawal();

	}

	@Override
	public void withdrawal() {
		System.out.println("i am overridden deposit from hdfc");	
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposit from hdfc");	
		
	}

}
