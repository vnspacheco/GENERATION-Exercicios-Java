package Aula1006.Exerc�cio1;

public class ClasseMain {

	public static void main(String[] args) {
		
		//Instanciando objetos
		Cachorro thor = new Cachorro("Thor", 10, "Rottweiler");
		Pregui�a flash = new Pregui�a("Flash", 20, "Pregui�a-real");
		
		System.out.println("=====Cachorro=====");
		System.out.println("Nome: " + thor.getNome());
		System.out.println("Idade: " + thor.getIdade());
		System.out.println("Ra�a: " + thor.getRaca());
		thor.locomover();
		System.out.println("===================");
		System.out.println();
		System.out.println("=====Pregui�a=====");
		System.out.println("Nome: " + flash.getNome());
		System.out.println("Idade: " + flash.getIdade());
		System.out.println("Ra�a: " + flash.getRaca());
		flash.locomover();
		System.out.println("===================");
	}
}