//Arshia AbdolhosseiniKalkhoeani 10391170 1/23/2020 lab1 task 2 Dice.java

import java.lang.Math;
import java.util.Scanner;
class dice {
public static void main(String[] args) { 
			
			
			int dice1 = (int)(Math.random() * 6) + 1;//first roll
			int dice2 = (int)(Math.random() * 6) + 1;
			int result = dice1 + dice2;
			
			
			if(result == 2 || result == 3 || result == 12 ) {//fast lose case if not true sent to the next levels
				System.out.println("you rolled "+ dice1+"+"+dice2+"="+ result +"\nBetter Luck Next Time, You lose");
				
			}else if(result == 7 || result == 11 ) {//fast win case if not true will be sent to the next level
				System.out.println("you rolled "+ dice1+"+"+dice2+"="+ result +"\nCongratulations, You win");
				
			}else {//Catches the more complicated point based case
				int point = result;
				System.out.println("you rolled "+ dice1+"+"+dice2+"="+ result );
				System.out.println("Point is set to: "+ point );
				int innerResult;//result inside the while loop i got errors when i decleared it in the do while loop
				do{
				dice1 = (int)(Math.random() * 6) + 1;//reroll everytime
				dice2 = (int)(Math.random() * 6) + 1;
				innerResult = dice1 + dice2;
				
				System.out.println("you rolled "+ dice1+"+"+dice2+"="+ innerResult );
				if(innerResult == point) {//if point and innerresult match win condition
					System.out.println("Congratulations, You Win ");
					break;
				}else if(innerResult == 7) {//if innerresault is 7 you lose
					System.out.println("Better Luck Next Time, You lose");
					break;
				}
				
			}while(innerResult != point || innerResult != 7) ;//keep doeing as long as the inner result is not 7 or the same as point(losing or winning)
			
			
			
		}
		
	}

    
}