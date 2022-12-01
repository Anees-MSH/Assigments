package week1.day2.assign;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//int input = 28;
		
		//if(input%1==0 && input%input==0) {
		//	System.out.println("The given number is prime number" + input );
		//}else {
		//	System.out.println("The given number is not a prime number" + input );
		
		
		int n = 6;
		boolean isPrime = false;
		
		for(int i = 2; i < n; i++) 
		{
			
		if (n % i ==0)
		{ 
			isPrime = true;
			break;
		}
		}
				System.out.println(isPrime);

	}
}


