package com.senecacollege.randAccess;

import java.io.*;
import java.util.Scanner;



public class Util {
	
	
	
	public static String find(String year, String name) {
			
		String file1= "babynamesranking";	
		String file3= ".txt";
		String fileName = file1+ year + file3;	
		
		
		
		String returner = "";
		String line;  
		try {
			File file=new File(fileName);    //creates a new file instance  
		
		    Scanner scanner = new Scanner(file);

		    //now read the file line by line
		    int lineNum = 0;
		    while (scanner.hasNextLine()) {
		        line = scanner.nextLine();
		        lineNum++;
		        if(finder(line, name)) { //if name is in that line
		            int i =0;
		        	while(true) {//seperate the number in the begining of the line one by one if they are 2 or 3 digits 
		            	if(isNumeric(line.substring(i, i+1))) {
		            		returner += line.substring(i, i+1);
		            		i++;
		            	}else {
		            		return returner;//return the ranking
		            	}
		            }
		        }
		    }
		} catch(FileNotFoundException e) { 
		    System.out.print(e);
		
		}
		return "";//if its not found
	
	
	

	
	}
	
	public static boolean finder(String line, String name) {//if name exists in that line
		return line.indexOf(name) !=-1? true: false;
		
	}
	public static boolean isNumeric(String strNum) {//if a string is numeric
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        int i = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}






