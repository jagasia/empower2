package com.empower.demo;

import java.io.IOException;

public class Bank {
	public void withdraw(int amount) throws InvalidAmountException
	{
		if(amount>20000)
		{
//			throw new IOException("Amount is invalid");
			throw new InvalidAmountException("Amount is wrong");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
