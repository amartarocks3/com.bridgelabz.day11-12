package day11;

import java.util.Scanner;

public class Account {
	
	public String debit(int a,int b) {
		String print;
		if(a>b) {
			a=a-b;
			print="After debit the remaining balance is"+a;
		}
		else {
			print="Debit amount exceeded account balance";
		}
		return print;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the account balance");
	int balance=sc.nextInt();
	System.out.println("Enter the ammout to be debited");
	int debit=sc.nextInt();
	Account a = new Account();
	String st = a.debit(balance,debit);
	System.out.println(st);
}
}
