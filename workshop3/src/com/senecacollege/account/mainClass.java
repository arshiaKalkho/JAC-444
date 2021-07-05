/////////////////arshia a kalkhorani 106391170

package com.senecacollege.account;
import java.util.*;

class mainClass {
	public static void main(String[] args) {
	accountList list = new accountList();//list item for the program to use

	while(true) {
		list.run();//run creates the array, fills each index and fills the object 
		System.out.println("do you want to exit or search account(continue:0 exit:1 search:2)");
		Scanner in2 = new Scanner(System.in);
		int exit = in2.nextInt();
		if(exit == 1) {
			list.display();//display all accounts 
			break;
		}else if(exit == 2) {//searching for account
			while(true) {
				System.out.println("enter the account id: ");
				Scanner in3 = new Scanner(System.in);
				int id = in3.nextInt();
				int index = list.find(id);
				list.accounts[index].display();
				System.out.println("do you want to exit or search account(continue:0 exit:1)");
				Scanner in4 = new Scanner(System.in);
				exit = in4.nextInt();
				if(exit == 1) {//exit if
					break;
				}
				
			} break; //exit outer loop
		}
		
		
		}
	}
}

