package Posto.servicos;

import java.util.Scanner;

//Richard Gomes Teixeira

public class TrocaOleo {
	
	static double litroOleo = 40.75;
	static double filtroOleo = 55.45;
	static double filtroCombustivel = 20.13;
	static double filtroAr = 120.75;
	static double valorServicoSimples = litroOleo * 3;
	static double valorServicoCompleto = litroOleo + filtroOleo + filtroCombustivel + filtroAr;
	static int servicoEscolhido;
	static double valorTotalTrocaOleo;
	
	public static void servicoTrocaOleo() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, vamos cuidar do motor do seu veículo?");
		
		do {
		
			System.out.printf("[1] - Troca Simples (somente 3 litros de óleo) R$%.2f\n", valorServicoSimples);
			System.out.printf("[2] - Troca Completa (3 litros de óleo, filtro de óleo, filtro de combustível e filtro de ar) R$%.2f\n", valorServicoCompleto);
			System.out.println("Por gentileza nos informe qual serviço deseja efetuar:");
			servicoEscolhido = entrada.nextInt();
			
			if (servicoEscolhido == 1) {
				System.out.printf("Você escolheu a Troca Simples, nesse caso o valor do serviço ficará R$%.2f\n", valorServicoSimples);
				valorTotalTrocaOleo = valorServicoSimples;
			} else if (servicoEscolhido == 2) {
				System.out.printf("Você escolheu a Troca Completa, nesse caso o valor do serviço ficará R$%.2f\n", valorServicoCompleto);
				valorTotalTrocaOleo = valorServicoCompleto;
			} else {
				System.out.println("A opção escolhida é inválida, por gentileza escolha uma opção válida!");
			}
		
		} while (servicoEscolhido != 1 && servicoEscolhido != 2);
		
		System.out.println("Qual seria a forma de pagamento?");

		Pagamento.formaPagamento(valorTotalTrocaOleo);
		
		entrada.close();
	}

