package Posto.pagamento;

import java.util.Scanner;

// Richard Gomes Teixeira

public class Pagamento {
	  
	static int opcaoPagamento;
	
	 public static void formaPagamento(double valorServico) {
		 
		Scanner entrada = new Scanner(System.in);
		
		do {
		
			System.out.println("Qual a forma de pagamento?");
			System.out.println("[1] - Pix ");
			System.out.println("[2] - Cartão de Débito ");
			System.out.println("[3] - Certão de Crédito");
			System.out.println("[4] - Dinheiro");
			System.out.println("Digite qual numero da sua opção: ");
			opcaoPagamento = entrada.nextInt();
			
			if (opcaoPagamento == 1) {
				PagamentoPix.pix(valorServico);
			} else if (opcaoPagamento == 2) {
				PagamentoDebito.debito(valorServico);
			} else if (opcaoPagamento == 3) {
				PagamentoCredito.credito(valorServico);
			} else {
				PagamentoDinheiro.dinheiro(valorServico);
			}
			
			System.out.println("Obrigado por escolher nossos serviços. Volte sempre!");
 		 
		} while (opcaoPagamento != 1 && opcaoPagamento != 2 && opcaoPagamento != 3 && opcaoPagamento != 4);
	   
		entrada.close();
		
	 }
}
