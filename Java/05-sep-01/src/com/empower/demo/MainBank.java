package com.empower.demo;

import java.io.IOException;
import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		try(Scanner sc=new Scanner(System.in)) {
			sbi.withdraw(21000);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.out.println("Handled");
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
