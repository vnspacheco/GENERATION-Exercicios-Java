package Aula0406;

import java.util.Scanner;

public class La�oDeRepeti��o2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			
			if(numero == 10) {
				System.out.println("Acertou!");
			}
			
			else {
				System.out.println("Errou!");
			}
		}
			
		input.close();
	}
}
