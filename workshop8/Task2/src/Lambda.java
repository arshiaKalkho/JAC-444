//arshia a kalkhorani

class Lambda{
	//////////////////interfaces
	@FunctionalInterface
	public interface ArrayProcessorMax {
	double max( double[] array );
	} 
	public interface ArrayProcessorMin {
		double min( double[] array );
	} 
	public interface ArrayProcessorSum {
		double sum( double[] array );
	} 
	public interface ArrayProcessorAve {
		double ave( double[] array );
	} 
		
		
	
	
	public static void main(String[] args) {
		///tester list
		double[] list = {5,7,9,6,4,7,8,6,54,3,3,35,6,666,7,8,7756536,5,45,54.7,53.7,71.7};
		
		
		////////////////////////////LAMBDAS
		ArrayProcessorMax max = (double[] arr)->{//maximum
			double biggest =0;
			for(int i = 0; i < arr.length;i++) {
				if(arr[i]>biggest) {
					biggest = arr[i];
				}
			}return biggest;
		};
		
		ArrayProcessorMin min = (double[] arr)->{//minimum
			double smallest =1000000000;
			for(int i = 0; i < arr.length;i++) {
				if(arr[i]<smallest) {
					smallest = arr[i];
				}
			}return smallest;
		};
		ArrayProcessorSum sum = (double[] arr)->{//sum
			double summ =0;
			for(int i = 0; i < arr.length;i++) {
				 summ+= arr[i];
			}return summ;
		};
		ArrayProcessorAve ave = (double[] arr)->{//average
			double summ =0;
			for(int i = 0; i < arr.length;i++) {
				 summ+= arr[i];
			}return summ/arr.length;
		};
		
		////////////////////////////////////lambda calls
		System.out.println("the max is: "+ maximum(list, max));
		System.out.println("the min is: "+ minimum(list, min));
		System.out.println("the sum is: "+ summ(list,sum));
		System.out.println("the ave is: "+ average(list,ave));
	}
	
	
	
	
	///////////////////////////functions returning lambdas
	static double maximum(double[] arr, ArrayProcessorMax func) {
		return func.max(arr);
	}
	static double minimum(double[] arr, ArrayProcessorMin func) {
		return func.min(arr);
	}
	static double summ(double[] arr, ArrayProcessorSum func) {
		return func.sum(arr);
	}
	static double average(double[] arr, ArrayProcessorAve func) {
		return func.ave(arr);
	}
	
	
	
}