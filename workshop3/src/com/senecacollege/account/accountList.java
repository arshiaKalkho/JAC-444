//arshia a kalkhorani 106391170
package com.senecacollege.account;

import java.util.Scanner;

public class accountList extends account {
	final int MAX = 20;//preset max number of elements in the array
	account accounts[] = new account[MAX];//holds accounts
	int numFilled = 0;//number of elements in the array
	
	
	accountList(){}
	void run() {//fills one item in the array runs their functions
		
		
		accounts[numFilled] = new account();
		accounts[numFilled].createAccount();
		System.out.println("account with ID of: "+ accounts[numFilled].id()+" is saved in location: "+numFilled+" of the list");
		System.out.println("do you want to 1:withdraw 2:deposit or 3: skip");
		Scanner in5 = new Scanner(System.in);
		double choice = in5.nextInt();
		if(choice == 1) {
		System.out.println("enter withdrawal amount: ");
		Scanner in3 = new Scanner(System.in);
		double ammount = in3.nextDouble();
		accounts[numFilled].withdraw(ammount);
		System.out.println("new account balance and summey. ");
		accounts[numFilled].display();
		}else if(choice == 2) {
		System.out.println("enter deposite amount: ");
		Scanner in4 = new Scanner(System.in);
		double ammount1 = in4.nextDouble();
		accounts[numFilled].deposit(ammount1);
		System.out.println("new account balance and summey. ");
		accounts[numFilled].display();
		}else {}
		this.numFilled++;
			
	}
	int find(int id) {
		for(int i = 0; i < numFilled; i++) {
			if(accounts[i].id() == id) {
				return i;
			}
			
		}return -1;
	}
	void displayDepth(int id) {
		int i = find(id);
		int diff = compareDate(accounts[numFilled].dateCreated());
	}

	void display() {//display all objects in array
		for(int i = 0; i < numFilled; i++) {
			accounts[i].display();		
		}
	}
}
