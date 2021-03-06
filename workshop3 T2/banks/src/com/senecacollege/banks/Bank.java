//Arshia a Kalkhorani 106391170
package com.senecacollege.banks;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Bank {
	
///////////////////////////////////////EXCEPTION BLOCK ADDED LINE:80///////////////////////////////////////////// 
	//member variables
		static final int bankID = 0;
	    static final int loan = 1;
	    static double[][][] banks;
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of banks: ");
	        int n = input.nextInt();
	        System.out.print("Enter minimum limit: ");//limit
	        int limit = input.nextInt(); 
	        banks = new double[n][][];
	        System.out.println("Enter the following information for each bank, in order:");
	        System.out.println("Bank #, Balance, Number of banks Loaned, 1st Bank ID, Amount, 2nd Bank ID, Amount,  ...");
	        
	        
	        ///entering bank information
	        for (int i = 0; i < banks.length; i++) {
	            System.out.print("Bank #" + i + " > ");
	            double balance = input.nextDouble();
	            int numBanks = input.nextInt();
	            banks[i] = new double[++numBanks][2];
	            banks[i][0][0] = balance;
	            for (int bank = 1; bank < banks[i].length; bank++) {
	            	banks[i][bank][bankID] = input.nextInt();
	            	banks[i][bank][loan] = input.nextDouble();
	            }
	        }
	        
	        
	        System.out.println("");
	        displayMatrix(banks);
	        boolean[] unsafeIndex = checkBanks(banks, limit);
	        List<Integer> unsafeArr = new ArrayList<Integer>();
	        for (int i = 0; i < unsafeIndex.length; i++) {
	        	if (unsafeIndex[i] == true) {
	        		unsafeArr.add(i);
	        		System.out.println("Bank# " + i + ": unsafe");
	        	} else {
	        		System.out.println("Bank# " + i + ": safe");
	        	}
	        }
	        
	        if (unsafeArr.size() == 0) {
	        	System.out.println("All banks are safe");
	        } else if (unsafeArr.size() == 1) {
	        	System.out.print("The only unsafe bank is Bank " + unsafeArr.get(0));
	        }
	        else {
	            System.out.print("----unsafe banks:");
	            for (int j = 0; j < unsafeArr.size(); j++) {
	            	System.out.print(" Bank " + unsafeArr.get(j));
	            	if (j < unsafeArr.size()-1) {
	            		System.out.print(" and");
	            	}
	            }
	            System.out.print(" ----");
	        }
	        
	        input.close();
	    }

	    
	    
	    
	    
	    public static boolean[] checkBanks(double[][][] m, int limit) {//scans the banks checks for bankruptcy 

	        boolean[] indexUnsafeBanks = new boolean[m.length];
	        double total;
	        boolean safe = false;// set to true if the bank is not safe
	        try{
	        	while (!safe) {
	        
	            safe = true;
	            for (int banks = 0; banks < m.length; banks++) {
	                total = m[banks][0][0];
	                for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
	                    int index = (int)m[banks][LoanedBanks][bankID];
	                    if (!indexUnsafeBanks[index])
	                        total += m[banks][LoanedBanks][loan];
	                }
	                if (total < limit && !indexUnsafeBanks[banks]) {
	                    indexUnsafeBanks[banks] = true;
	                    safe = false;
	                }
	            }
	        }}catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("EXCEPTION:array out of bounds exception");
	        }
	        return indexUnsafeBanks;
	    }

	    public static void displayMatrix(double[][][] m) {

	        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n",
	                "Bank #|", "Balance $|", "Loaned #|", "Bank ID|", "Amount $|", "Bank ID|", "Amount $|");
	        for (int banks = 0; banks < m.length; banks++) {
	            System.out.printf("%-6d|%9.2f|%8d|", banks, m[banks][0][0], m[banks].length -1);

	            for (int LoanedBanks = 1; LoanedBanks < m[banks].length; LoanedBanks++) {
	                System.out.printf("%7.0f|%8.2f|", m[banks][LoanedBanks][bankID], m[banks][LoanedBanks][loan]);
	            }
	            System.out.println("");
	        }
	    }
	}

