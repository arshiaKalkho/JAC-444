//arshia a kalkhornai 106391170
package com.senecacollege.PhoneNumberLetter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import 

public class PhoneNumLetter {
	public static List<String> strings = new ArrayList<String>();
	public static final String [][]list = {
			{"a","b","c"},
			{"d","e","f"},
			{"g","h","i"},
			{"j","k","l"},
			{"m","n","o"},
			{"p","r","s"},
			{"t","u","v"},
			{"w","x","y"}};
	
	public static void main(String args[]) {
		
		String num;
		while(true) {
		Scanner input = new Scanner(System.in);
        System.out.print("enter number (7 digits) avoid 1s and 0s exception will be thrown: ");
        num = input.next();
        if(num.length() != 7 || num.isEmpty()) {
        	System.out.println("the number is not correct");
        }else {
        	break;
        }
        }
        try {
        	proccess(num);//line:49
        	
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        	System.exit(0);
        	
        }
        System.out.println("completed sending to file");
        
        toFile();
        
	
}
	public static void proccess(String num) throws  ArrayIndexOutOfBoundsException{
		
		 int counter = 0;
		char word[] = new char[7];//temp to hold wach string and will be saved in strings array list after each string is created and then overwritten
		for(int a = 0; a < 3;a++) {
		
		word[0] =	list[find(num.charAt(0))][a].charAt(0);	//2d array takes two 'arguments' in the form of[x][y] this is just doeing that and changing different things to int
		//to make sure they are useable mostly string and chars to int using the function find on line 116
			
			
			for(int b = 0; b < 3;b++) { 
			word[1] =	list[find(num.charAt(1))][b].charAt(0);	
					

				for(int c = 0; c < 3;c++) {
					
					word[2] =	list[find(num.charAt(2))][c].charAt(0);		
						 
				
					for(int d = 0; d < 3;d++) {
						
						word[3] =	list[find(num.charAt(3))][d].charAt(0);		
							
					
						for(int e = 0; e < 3;e++) {
							
							word[4] =	list[find(num.charAt(4))][e].charAt(0);		
								
						
							for(int f = 0; f < 3;f++) {
								
								word[5] =	list[find(num.charAt(5))][f].charAt(0);		
									
							
								for(int g = 0; g < 3;g++) {
									
									word[6] =	list[find(num.charAt(6))][g].charAt(0);		
									String temp = new String(word);//temp is for the add argument on the line bellow as it takes only string and we have array of char
									counter++;
									strings.add(temp);

									}
								}
								
							
							}				
						}
						
					}
					
				}
				
			}
		System.out.println("number of string are: "+counter);
		
			
	}
		
		
		
		
		
		
	
	
	
	public static int find(char letter) {
		
		int num = Character.getNumericValue(letter);//2d array doesn't have 0 or 1 index starts from two, this function translates so it matches the program by changing it to int and -2
		return num-2;
	}
	public static void toFile() {
		 FileWriter fw;

		    try {
		      fw = new FileWriter(new File("answear.txt"));
		      
		  
		      for (String s : strings) {
		        fw.write(s);
		        fw.write(System.lineSeparator());
		      }
		      System.out.println("All permitations written in file called answear.txt");
		      fw.close();
		    } catch (Exception e) {
		      e.printStackTrace();	
	}
	
	}
}
