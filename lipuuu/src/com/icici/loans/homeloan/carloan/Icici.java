package com.icici.loans.homeloan.carloan;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i=new Icici();
		i.deposit();
		i.withdrawal();
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("i am overridden withdrawl from icici");	
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit from icici");		
	}

}
