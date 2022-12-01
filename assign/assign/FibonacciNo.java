package week1.day2.assign;

public class FibonacciNo {
	
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

			// Print first number
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum


	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1, sum;
		
		System.out.println(firstNum);
		
		
		for(int i =1 ; i <= range; i++ ) {
			
			sum = firstNum + secNum;
			secNum = firstNum;
			sum =secNum;
			System.out.println(sum);
			
			
		}
		
			
	}

}
