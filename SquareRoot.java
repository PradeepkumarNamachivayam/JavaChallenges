package special;

public class SquareRoot {
	/*
	 * public static int squareRoot(int num) { //initialize count int count = 0;
	 * //iterate using for loop for(int i = 1; i <= num; i+=2){ // Subtract n-th odd
	 * number num = num - i; count =count+1;
	 * 
	 * if (num == 0) { break; } }
	 * 
	 * // Return the result return count; }
	 */

	
	public static void main(String[] args){
		int count = 0;
		int N = 100;
		//System.out.println(squareRoot(N));
		for(int i =1;i<=N;i+=2) {
			N = N -i;
			count = count + 1;
			if(N==0) {
				break;
			}
			System.out.println(N);
			
		}
		System.out.println("The Square root of the given number is : "+  count);
	}
	}













	
		/*double temp;

		double sr = number / 2;                                       //sqrt(n+1)=sqrt(n)+num/sqrt(n) divided by 2.0

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	    }

	    public static void main(String[] args)  
	    { 
		SquareRoot sqr = new SquareRoot();
		double squareRoot = sqr.squareRoot(5);
		System.out.println(squareRoot);	    } 
	}*/