package Aula0806;

public class Exerc�cio2Avi�o {
	public static void main(String[] args) {
		
		Exerc�cio2Avi�o aviao1 = new Exerc�cio2Avi�o();
		
		aviao1.modelo = "Airbus A320";
		aviao1.capacidadeDePassageiros = 240;
		aviao1.velocidadeMaxima = 871.0;
		aviao1.autonomia = 6100.0;
		
		System.out.println("Modelo: " + aviao1.modelo);
		System.out.println("Capacidade de passageiros: " + aviao1.capacidadeDePassageiros);
		System.out.println("Velocidade m�xima em km/h: " + aviao1.velocidadeMaxima);
		System.out.println("Autonomia em km: " + aviao1.autonomia);
		
		System.out.println("");
		
		aviao1.acelerar();
		aviao1.decolar();
		aviao1.pilotoAutomatico();
		aviao1.desascelerar();
		aviao1.pousar();
		
	}
	
	public String modelo;
	public int capacidadeDePassageiros;
	public double velocidadeMaxima;
	public double autonomia;
	
	public void acelerar(){
		System.out.println("Acelerando...");
	}
	public void decolar(){
		System.out.println("Decolando...");
	}
	public void pilotoAutomatico(){
		System.out.println("Piloto autom�tico ligado.");
	}
	public void desascelerar(){
		System.out.println("Desascelerando...");
	}
	public void pousar(){
		System.out.println("Pousando...");
	}
}