package Posto.pagamento;

import java.util.Scanner;

//Richard Gomes Teixeira

public class PagamentoPix {
	
	static int chavePix;
		
	public static void pix(double valorServico) {
	
	Scanner entrada = new Scanner(System.in);
	
		while (true) {
			System.out.println("A forma de pagamento escolhida é Pix, por gentileza informe sua chave Pix");
			System.out.println("[1] - CPF");
			System.out.println("[2] - E-mail");
			System.out.println("[3] - Celular");
			System.out.println("[4] - Chave aleatória");
			chavePix = entrada.nextInt();
			
			if (chavePix == 1) {
				boolean cpfValido = false;
				
				while (!cpfValido) {
					System.out.println("Por gentileza informe o número de seu CPF, favor informar somente números");
					String cpf = entrada.next();
					if (cpf.length() != 11) {
						System.out.println("O CPF informado não é válido. Por gentileza informe um número válido!");
					} else {
					String bloco1 = cpf.substring(0, 3);
					String bloco2 = cpf.substring(3, 6);
					String bloco3 = cpf.substring(6, 9);
					String bloco4 = cpf.substring(9, 11);

					String cpfFormatado = bloco1 + "." + bloco2 + "." + bloco3 + "-" + bloco4;

					System.out.println("O número de CPF informado é: " + cpfFormatado);
					
				cpfValido = true;
					}
				}
				System.out.println("Informe o valor a ser pago:");
				double valorPago = entrada.nextDouble();
				
				while (valorPago < valorServico) {
				    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
				    valorPago = entrada.nextDouble();
				}
				break;
			} else if (chavePix == 2) {
				System.out.println("Por gentileza informe o seu e-mail");
				entrada.next();
				System.out.println("Informe o valor a ser pago:");
				double valorPago = entrada.nextDouble();
				
				while (valorPago < valorServico) {
				    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
				    valorPago = entrada.nextDouble();
				}
				break;
			} else if (chavePix == 3) {
				System.out.println("Por gentileza informe o seu telefone celular");
				entrada.next();
				System.out.println("Informe o valor a ser pago:");
				double valorPago = entrada.nextDouble();
				
				while (valorPago < valorServico) {
				    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
				    valorPago = entrada.nextDouble();
				}
				break;
			} else if (chavePix == 4) {
				System.out.println("Por gentileza informe sua chave aleatória");
				entrada.next();
				System.out.println("Informe o valor a ser pago:");
				double valorPago = entrada.nextDouble();
				
				while (valorPago < valorServico) {
				    System.out.println("O valor informado é inferior ao valor total do serviço, por gentileza informe o valor correto!");
				    valorPago = entrada.nextDouble();
				}
				break;
			} else {
				System.out.println("A chave escolhida é inválida, por gentileza escolha uma chave válida!");
			}
		
			entrada.close();

		}
	}
}
