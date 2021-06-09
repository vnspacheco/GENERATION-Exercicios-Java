package Aula0906.Exerc�cio1;

public class Imprime {
	public static void main(String [] args) {
		
		//Inst�ncias - Criando objetos
		Cachorro thor = new Cachorro("Thor", 5);
		Cavalo peDePano = new Cavalo("P� de pano", 8);
		Pregui�a flash = new Pregui�a("Flash", 3);
		
		//Intera��o com console
		System.out.println("=====Cachorro=====");
		System.out.println("Nome: " + thor.getNome());
		System.out.println("Idade: " + thor.getIdade());
		System.out.println("Estados: ");
		thor.emitirSom();
		thor.correr();
		
		System.out.println();
		
		System.out.println("=====Cavalo=====");
		System.out.println("Nome: " + peDePano.getNome());
		System.out.println("Idade: " + peDePano.getIdade());
		System.out.println("Estados: ");
		peDePano.emitirSom();
		peDePano.correr();
		
		System.out.println();
		
		System.out.println("=====Pregui�a=====");
		System.out.println("Nome: " + flash.getNome());
		System.out.println("Idade: " + flash.getIdade());
		System.out.println("Estados: ");
		flash.emitirSom();
		flash.subirEmArvores();
	}
}
