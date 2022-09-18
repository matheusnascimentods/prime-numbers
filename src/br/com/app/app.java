package br.com.app;

import java.util.Scanner;

import br.com.app.model.PrimeNumbers;

public class app {

	public static void main(String[] args) {
		
		String answer = "S";
		Scanner input = new Scanner(System.in);
		
		while (answer.equals("S")) {
		
			System.out.println("Digite um numero, e descubra se ele e primo");
			
			
			int number = Integer.parseInt(input.nextLine());
			
			PrimeNumbers.isPrime(number);
			
			System.out.println("Quer tentar outro numero? [Digite 'S' para continuar]");
			answer = input.nextLine().toUpperCase();
			
		} 

	}

}
