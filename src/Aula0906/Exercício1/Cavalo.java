package Aula0906.Exerc�cio1;

public class Cavalo extends Animal{
	
	//Construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	//M�todo
	
	public void emitirSom () {
		System.out.println("Cavalo relinchando");
	}
	public void correr () {
		System.out.println("Cavalo correndo");
	}
}