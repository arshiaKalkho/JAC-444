//arshia a kalhorani 106391170 1/30/2020
import java.util.*;

public class tax {
static public void main(String[] args)
	{//data
	int[][]brackets2001 = 
		{{27050, 65550, 136750, 297350},{45200,109250,166500,297350},{22600,54625,83250,148675},{36250,93650,151650,297350}};// Stores the tax brackets for each filing status.
	int[][]brackets2009 = 
		{{8350, 33950, 82250, 171550, 372950},{16700,67900,137050,208850,372950},{8350,33950,68525,104425,186475},{11950,45500,117450,190200,372950}};
	double[] rates2001 = {0.15,0.275,0.305,0.355,0.391};// Stores the tax rates for each bracket.
	double[] rates2009 = {0.10,0.15,0.25,0.28,0.33,0.35};
	
	
	
	
	
	//start
	System.out.println("1 for program 2 for full list: ");
	Scanner in1 = new Scanner(System.in);
	int progChoice = in1.nextInt();
	
	if(progChoice == 1) {
	System.out.println("0 - single filer\n1 - married jointly or qualifying widow(er)\n2 - married separately\n3 - head of household)\n");
	System.out.println("Enter the filing status: ");
	Scanner in2 = new Scanner(System.in);
	int statusChoice = in2.nextInt();	
	System.out.println("Enter the Taxable Income: ");
	Scanner in3 = new Scanner(System.in);
	int income = in3.nextInt();
	
	//first option//////////////////////////////////////
	taxFamily temp = new taxFamily(statusChoice, brackets2009, rates2009, income);
	double tax = temp.procces();
	System.out.println("Tax is: "+ tax);
	////////////////////////////////////////////////////
	
	}else {
		System.out.println("Enter the amount From: $");
		Scanner min = new Scanner(System.in);
		int minChoice = min.nextInt();	
		
		
		System.out.println("Enter the amount To: $");
		Scanner max = new Scanner(System.in);
		int maxChoice = max.nextInt();	
		taxFamily temp = new taxFamily();//temp object to use its functions
		
		//second option////////////////////////////////
		System.out.println("\n2001 tax tables for taxable income from $"+minChoice+" to $"+maxChoice);
		temp.displayTaxList(minChoice, maxChoice, brackets2001,rates2001);	
		System.out.println("\n2009 tax tables for taxable income from $"+minChoice+" to $"+maxChoice);
		temp.displayTaxList(minChoice, maxChoice, brackets2009,rates2009);
		//////////////////////////////////////////////
	}
	}
}