package Aula0706;

public class ArrayVetor2 {
	public static void main(String[] args) {
		
		double minhaNota;
		double[] notas = new double[2];
		
		notas[0] = 9.6;
		minhaNota = notas[0];
		
		System.out.println("A variavel cont�m minhaNota: " + minhaNota);
		System.out.println("A variavel cont�m notas[0]: " + notas[0]);
		
		//N�o imprime nada porque n�o foi declarado nada na posi��o 1 do ArrayVetor
		System.out.println("A variavel cont�m notas[1]: " + notas[1]);
	}
}
