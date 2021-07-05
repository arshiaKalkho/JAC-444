package com.senecacollege.FileLetterCounter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner; 
//arshia a kalkhornai 106391170

public class FileLetterCounter {
	public static final String list = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";//for searching
	public static void main(String args[]) {
		
		
		//getting name of file
		Scanner input = new Scanner(System.in);
        System.out.print("enter name of file(with extention): ");
        
        String fileName = input.next();
        
        
        String content = read(fileName);//filling content with file data
        count(content);
	}
	
	
	
	
	
	
	static String read(String filename) {//returns content of file as a string
		 String data = "";
		try{	
				FileInputStream in = new FileInputStream(filename);
				int i =0;
				while((i = in.read())!=-1) {
        			data += (char)i;
        		}
        		}catch(FileNotFoundException e){
        			System.out.println("exception has been thrown:" + e);
        			
        		}catch(IOException e){
        			System.out.println("exception has been thrown:" + e);
        			
        		}
				
		return data;
	}
	static void count(String data) {
		if(!data.isEmpty()) {//if data is empty stop
		for(int i = 0; i < list.length();i++) {
			int counter = 0;
			for (int j=0; j < data.length(); j++) {
				if(data.charAt(j) == list.charAt(i)) {
					counter++;
				}
			}
			System.out.println("there are "+counter +" many of "+list.charAt(i) +" in the file");
		}
		}
		
		
		
		
		
	}
}
