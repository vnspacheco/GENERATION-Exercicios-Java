package Aula0206;

import java.util.Scanner;

public class Exerc�cio3 {
	public static void main (String [] args) {
		
		double tempoDoEvento, segundos, minutos, horas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual foi a dura��o do evento em segundos? ");
		tempoDoEvento = input.nextInt();
		
		horas = tempoDoEvento / 3600;
		minutos = tempoDoEvento / 60;
		segundos = tempoDoEvento;
		
		
		System.out.printf("\nDura��o do evento em horas: %.2f", horas);
		System.out.printf("\nDura��o do evento em minutos: %.2f", minutos);
		System.out.printf("\nDura��o do evento em segundos: " + segundos);
		
		input.close();
		
	}
}
