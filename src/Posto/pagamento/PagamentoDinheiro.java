package Posto.pagamento;

import java.util.Scanner;

// Richard Gomes Teixeira

public class PagamentoDinheiro {
	
	public static void dinheiro(double valorServico) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("A forma de pagamento escolhida é dinheiro");
		System.out.println("Informe o valor a ser pago:");
		double valorPago = entrada.nextDouble();
		
		while (valorPago < valorServico) {
		    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
		    valorPago = entrada.nextDouble();
		}
		if (valorPago > valorServico) {
			double troco = valorPago - valorServico;
			System.out.printf("O seu troco é R$%.2f\n", troco);
		}
		entrada.close();
	}
}
