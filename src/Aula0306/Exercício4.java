package Aula0306;

import java.lang.Math;
import java.util.Scanner;

public class Exerc�cio4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valor, resultado, raizQuadrada, elevadoAoQuadrado;
		
		System.out.println("Digite um valor: ");
		valor = input.nextDouble();
		
		resultado = valor % 2;
		
		if (resultado == 0) {
			raizQuadrada = Math.sqrt(valor);
			System.out.printf("Seu n�mero � par, e a raiz quadrada dele �: %.2f", raizQuadrada);
		}
		else {
			elevadoAoQuadrado = valor * valor;
			System.out.println("Seu n�mero � �mpar, e elevado ao quadrado �: " + elevadoAoQuadrado);
		}
		
		input.close();
	}
}
