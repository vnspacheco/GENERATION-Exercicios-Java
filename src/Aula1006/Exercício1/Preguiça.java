package Aula1006.Exerc�cio1;

public class Pregui�a extends SuperClasseAnimal implements InterfaceAnimal{

	//Construtor
	public Pregui�a(String nome, int idade, String raca) {
		super(nome, idade, raca);
	}

	//Polimorfismo
	public void locomover() {
		System.out.println("Pregui�a subindo �rvore...");
	}
}