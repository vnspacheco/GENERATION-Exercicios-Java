package Aula0306;

import java.util.Scanner;

public class La�oCondicional {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 6.0) {
			
			System.out.println("Parab�ns, voc� foi aprovado!!" + "\nM�dia: " + media);

		}

		else if (media >= 3 && media < 6) {

			System.out.println("Voc� est� de recupera��o..." + "\nM�dia: " + media);

		}

		else {

			System.out.println("Voc� foi reprovado!" + "\nM�dia: " + media);

		}

		input.close();
	}
}
