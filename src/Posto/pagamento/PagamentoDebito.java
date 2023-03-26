package Posto.pagamento;

import java.util.Scanner;

// Richard Gomes Teixeira

public class PagamentoDebito {
	
	public static void debito(double valorServico) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("A forma de pagamento escolhida é cartão de débito");
		System.out.println("Informe o valor a ser pago:");
		double valorPago = entrada.nextDouble();
		
		while (valorPago < valorServico) {
		    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
		    valorPago = entrada.nextDouble();
		}
		entrada.close();
	}

}