package Aula0406;

import java.util.Scanner;

public class Exerc�cio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int q = 2, numero, resultado, par = 0, impar = 0;
		
		for(int i = 0; i <q; i++) {
			System.out.println("Digite um valor: ");
			numero = input.nextInt();
			resultado = numero % 2;
			
			if(resultado == 0) {
				par += 1;
			}
			else {
				impar += 1;
			}
		}
		
		System.out.println("Quantidade de n�meros pares: " + par + "\nQuandidade de n�meros �mpares: " + impar);
		
		input.close();
	}
}
