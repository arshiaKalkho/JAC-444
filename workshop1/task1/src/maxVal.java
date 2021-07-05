//Arshia AbdolhosseiniKalkhoeani 10391170 1/23/2020 lab1 task 1 2d array
import java.util.Scanner;
class maxVal {
	public static void main(String arg[]) {
		//System.out.println("enter the size of the 2D array: ");//recieving the size of the array
		Scanner obj = new Scanner(System.in);
		int[] arra = new int[3];
		for(int i=0; i<arra.lenght; i++) {
			System.out.println("Enter the values:");
			arra[i] = obj.nextInt();
		}
		
		//String rawSize = obj.nextLine();
		
		
		/*String [] stringSize= rawSize.split(" ", 2);//splitting the two inputted numbers
		int [] size = new int[2];//initialize int array 
		
		
		size[0] = (Integer.parseInt(stringSize[0]));
		size[1] = (Integer.parseInt(stringSize[1]));//changing string to int and storing

		float [][] arr2d = new float[size[0]][size[1]];//initializing the main array
		
		System.out.println("Enter the array:");
		
		
		for(int i= 0; i <size[0]; i ++) {//row by row inputting numbers
			Scanner obj1 = new Scanner(System.in);
			String stringCol = obj1.nextLine();

			String stringTemp[] = stringCol.split(" "); //to be splitted and parsed to int 		

			
			for(int j = 0; j < size[1]; j++) {
			arr2d[i][j] = Float.parseFloat(stringTemp[j]);
			
			}
		}
		findLargest(arr2d);//function use
	}
	public static void findLargest(float [][] arr){//this function takes a 2d array and displays the value and the position of the largest member
		float max = 0;
		int col=0;
		int row=0;
		for(int i = 0; i < arr.length; i++  ) {
			for(int j = 0; j < arr[0].length; j++ ) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					col = i+1;
					row = j+1;
				}
			}
		}
		System.out.println("largest value is " + max + ", on " + col + "th coloumn and on the " + row + "th row");
		
	}
	
	*/
	}
	

}