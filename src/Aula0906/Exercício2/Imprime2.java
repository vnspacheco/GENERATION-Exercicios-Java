package Aula0906.Exerc�cio2;

import Aula0906.Exerc�cio1.Cachorro;
import Aula0906.Exerc�cio1.Cavalo;
import Aula0906.Exerc�cio1.Pregui�a;

public class Imprime2 {
	
	public static void main(String [] args) {
		
		TestaAnimais t1 = new TestaAnimais();
		
		t1.somAnimal(new Cachorro("Zeus", 7));
		t1.somAnimal(new Cavalo("Black", 12));
		t1.somAnimal(new Pregui�a("Lord", 3));
	}
}