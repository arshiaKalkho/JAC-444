//arshia a kalkhorani 106391170
package com.senecacollege.account;
import java.util.*;
//import java.lang.*;

class account {
	int id;
	private double balance = 0;// default to 0
	private double annualInterestRate = 0;// default to 0
	private Date dateCreated;
	private double montlyInterestRate = 0;// set later
	private int length = 0;// 1 month each

////////////////constructors
	account() {

		this.dateCreated = Calendar.getInstance().getTime();// time at the moment of initiation
	}

account(double balance, double annualIR, double MIR){
	this.dateCreated = Calendar.getInstance().getTime();//time at the moment of initiation
	this.annualInterestRate = annualIR;
	this.balance = balance;
//	
}
//////////////getters and setters
	void id(int id) {
		this.id = id;
	}// id getter

	int id() {
		return this.id;
	}// overloaded id setter

	void balance(double B) {
		this.balance = B;
	}// balance setter

	double balance() {
		return this.balance;
	}// overloaded balance getter

	void monthlyInterestRate(double AIR) {
		this.annualInterestRate = AIR;
	}// annualInterestRate setter

	double monthlyInterestRate() {
		return this.annualInterestRate / 12;
	}// overloaded annualInterestRate getter

	Date dateCreated() {
		return this.dateCreated;
	}

	double montlyInterestAmount() {//////////////////////////////////
		return ((this.annualInterestRate/100*this.balance)+this.balance)/this.length;
	}

	boolean withdraw(double ammount) {
		
		if (this.balance >= ammount) {
			this.balance -= ammount;
			System.out.println("Transaction Successfull. for " + ammount + "$ remaining balance" + this.balance);
			return true;
		} else {
			System.out.println("Tranaction Failed: insufficient funds");
			return false;
		}
	}

	void deposit(double ammount) {
		this.balance += ammount;
	}

	boolean lengthSetter(double num) {// sets all rates returns true if input is acceptible false otherwise
		if (num == 4.95) {
			this.annualInterestRate = num;
			this.montlyInterestRate = this.annualInterestRate / 12;
			this.length = 60;
			return true;
		} else if (num == 3.95) {
			this.annualInterestRate = num;
			this.montlyInterestRate = this.annualInterestRate / 12;
			this.length = 48;
			return true;
		} else if (num == 2.95) {
			this.annualInterestRate = num;
			this.montlyInterestRate = this.annualInterestRate / 12;
			this.length = 24;
			return true;
		} else if (num == 1.95) {
			this.annualInterestRate = num;
			this.montlyInterestRate = this.annualInterestRate / 12;
			this.length = 12;
			return true;
		} else if (num == 0.99) {
			this.annualInterestRate = num;
			this.montlyInterestRate = this.annualInterestRate / 12;
			this.length = 6;
			return true;
		} else {
			return false;
		}
	}

	void createAccount() {
		/////////////// set ID
		System.out.println("enter ID: ");
		Scanner in1 = new Scanner(System.in);
		int ID = in1.nextInt();
		this.id = ID;
		/////////////// set balance
		while (this.balance == 0) {
			System.out.println("enter Balance: ");
			Scanner in2 = new Scanner(System.in);
			double Bal = in2.nextDouble();
			if (Bal > 0) {
				this.balance = Bal;
				break;
			} else {
				System.out.println("please enter a valid balance");
			}
		}
		
	while (this.length == 0) {
			System.out.println("enter rate: ");
			Scanner in3 = new Scanner(System.in);
			double Rate = in3.nextDouble();
			if (!lengthSetter(Rate)) {
				System.out.println("rate is not available.");
			}
		}
	

	}

	void display() {
		System.out.println("ID: " + this.id + " created on " + this.dateCreated + " interest rate is "
				+ this.annualInterestRate + " current balance: " + this.balance +"$ there will be "+this.length+
				" payments ,"+this.montlyInterestAmount()+"$ each");
	}


 int compareDate( Date date2) {
	Date date1 = Calendar.getInstance().getTime();
	int m1 = date1.getYear() * 12 + date1.getMonth();
    int m2 = date2.getYear() * 12 + date2.getMonth();
    return m2 - m1 + 1;
}
 }

