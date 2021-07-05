//arshia a kalhorani 106391170 1/30/2020
public class taxFamily {
public int filingStatus;
public double taxableIncome;// Stores the taxable income

public double finalTax;//result 
public int brackets[][];
public double rates[];

taxFamily(){//0arg constructor

};


double tax() {return finalTax;}// returns the final tax


void setStatus(int s) {filingStatus = s;};//setting status


void setIncome(double s) {taxableIncome = s;};//setting income



taxFamily(int filigStatus, int [][]brackets, double[] rates,int income) {//4 arg constructor
	this.filingStatus= filigStatus;//setting member variables 
	this.taxableIncome = income;
	
	this.brackets = brackets;
	
	this.rates = new double[rates.length];//filling array
	for(int i =0; i < this.rates.length; i++) {
		this.rates[i] = rates[i];//copy rates into this.rate
	}

	this.brackets = new int[brackets.length][brackets[0].length];//filling 2d array
	for(int i=0;i < brackets.length; i++) {
		for(int j = 0; j< brackets[0].length; j++) {
			this.brackets[i][j] = brackets[i][j];//copy brackets into this.brackets
		}
	}
}

double procces() {
	double result = 0.0;
	if(this.taxableIncome <= brackets[filingStatus][0]) {
	result =+ this.taxableIncome*this.rates[0];//saving percentage on the list + itself in final variable
	return result;
	}
	result =+ brackets[filingStatus][0]*this.rates[0];//since we know we have at least till the first limit we don't need to count just * rate and save in result
	
	for(int i = 1; i < brackets[0].length; i++) {//starts from one since we already did the first step in the previous line
		
		if(this.taxableIncome >= brackets[filingStatus][i]) //if the total is more the current limit 
		{
			result += (brackets[filingStatus][i] - brackets[filingStatus][i-1])*this.rates[i];
		}else{
	
			result += (this.taxableIncome - brackets[filingStatus][i-1])*this.rates[i];//if total is less than the current limit
			
			return result;
		}
		
	
	}
	
	return result;//just so i have no errors this line will never run 
	}


void displayTaxList(int min, int max , int[][] list, double[] rate) {

	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Taxable	   Single  Married Joint      Married    Head of                   ");
	System.out.println("Income  	    or Qualifying     Separate    a House                   ");
	System.out.println("                      Widow(er)                                              ");
	System.out.println("----------------------------------------------------------------------------------");
	for(int i = min; i <=max ; i+=1000) {
		System.out.print("\n"+i);
		for(int j = 0; j < 4;j++) {
			taxFamily temp = new taxFamily(j,list, rate, i);//temp function to use its functions
			System.out.print("   ");
			System.out.printf("%.2f",temp.procces());//using procces to calculate each tax
			System.out.print("   ");
		}
	}

}
}
