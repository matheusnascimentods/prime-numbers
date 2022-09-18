package br.com.app.model;

public class PrimeNumbers {
	
	static public void isPrime(int number) {
		
		int count = 0;
		
		for (int i =1; i <= number; i++) {
			
			if (number%i == 0) {  count += 1;  }
			
		}
		
		if (count == 2) {
			
			System.out.println("Este numero e primo");
			
		} else {
			
			System.out.println("Este numero nao e primo");
			
		}
		
		
	}

	
}
