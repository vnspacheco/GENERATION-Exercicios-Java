package Aula0806;

public class Exerc�cio3BancoMain {
	public static void main(String[] args) {

		// Inst�nciando objeto
		Exerc�cio3Banco conta1 = new Exerc�cio3Banco();

		// Declarando atributos
		conta1.setNome("Pacheco");
		conta1.setDepositoInicial(100.00);

		// Aplicando m�todo
		conta1.abrirConta();

		// Movimentando conta banc�ria
		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());

		conta1.saque(100.00);

		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());

		conta1.deposito(1000);

		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());
	}
}
