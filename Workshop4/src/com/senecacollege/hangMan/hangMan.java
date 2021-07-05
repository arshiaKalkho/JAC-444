package com.senecacollege.hangMan;
import java.util.*;


public class hangMan {
	static String wordList[] = {"table","camp", "system", "aligator", "hangman", "heavy", "program", "pizza", "horse", "fantastic"};
	static String currentWord;//current word chosen
	static String blanckWord;
	static int correct = 0;//num of guesses
	static int incorrect = 0;
	static int complete = 0;//if = length of the word its completed
	
	
	
	
	public static void main(String args[]) /////////////////////////////////////main
	{
		Random num = new Random();
		int randNum = num.nextInt(wordList.length);//random num 0-6
		currentWord = wordList[randNum];//setting current word
		blanckWord = initialize(); 
		
		while(complete != currentWord.length()) {
			inputLetter();
		}
		System.out.println("the word was <"+currentWord+"> there where: "+correct+" correct and "+incorrect+" incorrect guesses.");
		
	}
	
	
	static String initialize() {
		String word = "";
		
		for(int i = 0; i < currentWord.length(); i++) {//filling 'word' with '*' same length as the length of the current word
			word = word + "*";
		}
		return word;
	};
	
	////////////////////////////////////////
	
	
	static String updateBlanck(char letter) {//puts the actual word instead of '*' in blackWords
		String word = "";
		
		for(int i = 0; i < currentWord.length(); i++) {//filling 'word' with '*' same length as the length of the current word
			if(currentWord.charAt(i) == letter) {
			word = word + letter;
			complete++;
			}else if(currentWord.charAt(i) == blanckWord.charAt(i)){
			word = word + blanckWord.charAt(i);
			}else {word = word + "*";}
		}
		return word;
	}
	
	///////////////////////////////////////
	
	
	static void inputLetter() {
		System.out.println("Enter your guess <"+blanckWord+">: ");
		Scanner in = new Scanner(System.in);
		char guess = in.next().charAt(0);
		if(currentWord.indexOf(guess) == -1){//guess is incorrect case
			incorrect++;
			System.out.println(guess+" is not in the word.");
			
		}else if(findLetter(guess)){
			System.out.println(guess+" is already in the word.");
		}else {//guess is correct
			
			correct++;
			blanckWord = updateBlanck(guess);
			
			
			
			
		}
	}
	
	static boolean findLetter(char letter) {
		for(int i =0; i < blanckWord.length(); i++ ) {
			if(blanckWord.charAt(i) == letter) {
				return true;
			}
		}return false;
		
	}
	
	
	
	

}
