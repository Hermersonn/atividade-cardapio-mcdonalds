package cardapioMcdonalds;

import java.util.Scanner;

public class homePagamento {
	
Scanner scan = new Scanner(System.in);

	public void main () {
		System.out.println("******************PAGAMENTO**********************");
		System.out.println("");
		System.out.println("1 - Fazer Cadastro: ");
		System.out.println("2 - Entrar na minha conta: ");
		System.out.println("");
		System.out.println("");
		int opcoesPagamento = scan.nextInt();
		
		if (opcoesPagamento == 1) {
			//Cadastro
		}
		else if (opcoesPagamento == 2 ) {
			System.out.println("Olá");
			System.out.println("");
			System.out.println("Você deseja realizar o pagamento atraves do: ");
			System.out.println("");
			System.out.println("1 - Cartão de Credito: ");
			System.out.println("2 - Débito: ");
			System.out.println("3 - Pix: ");
			System.out.println("");
			System.out.println("0 - Retorna para página Inicial");
			System.out.println("Digite a opção deseja: ");
			System.out.println("");
			
		}		
	}
	
	public void cartaoCredito () {
		
	}
	
	public void debito() {
		
	}
	
	public void pix () {
			
		}
}
