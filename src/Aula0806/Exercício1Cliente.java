package Aula0806;

public class Exerc�cio1Cliente {
	public static void main(String[] args) {
		
		Exerc�cio1Cliente cliente1 = new Exerc�cio1Cliente();
		
		cliente1.nome = "Pacheco";
		cliente1.endere�o = "Av. paulista, 1940";
		
		System.out.println("Cliente: " + cliente1.nome);
		System.out.println("Endere�o: " + cliente1.endere�o);
		cliente1.compra();
		
	}
	
	public String nome;
	public String endere�o;
	
	public void compra(){
		System.out.println("Cliente comprou");
	}
}