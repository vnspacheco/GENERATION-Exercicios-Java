package Aula0306;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maiorNumero = 0;
		
		System.out.println("Digite o primeiro valor: ");
		int n1 = input.nextInt();
		if (n1 > maiorNumero) {
			maiorNumero = n1;
		}		
		System.out.println("Digite o segundo valor: ");
		int n2 = input.nextInt();
		if (n2 > maiorNumero) {
			maiorNumero = n2;
		}
		System.out.println("Digite o terceiro valor: ");
		int n3 = input.nextInt();
		if (n3 > maiorNumero) {
			maiorNumero = n3;
		}
		
		System.out.println("Maior n�mero: " + maiorNumero);
		
		input.close();
	}
}
