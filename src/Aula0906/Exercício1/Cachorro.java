package Aula0906.Exerc�cio1;

public class Cachorro extends Animal {
	
	//Construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	//M�todo
	
	public void emitirSom () {
		System.out.println("Cachorro latindo");
	}
	
	public void correr () {
		System.out.println("Cachorro correndo");
	}
}