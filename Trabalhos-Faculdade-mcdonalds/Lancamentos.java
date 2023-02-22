package cardapioMcdonalds;

import java.util.Scanner;

public class Lancamentos {
	
	public void lancamentosHome() {
		Scanner scan = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		Home home = new Home(); 
		
		System.out.println("************LANÇAMENTOS*************");
		System.out.println("");
		System.out.println("1 - Mc Club");
		System.out.println("2 - Caldo&Freddo Maça");
		System.out.println("3 - McFlurry Prestigio Caramelo");
		System.out.println("4 - McFlurry Prestigio Chocolate");
		System.out.println("5 - McFlurry Prestigio Morango ");
		System.out.println("");
		System.out.println("0 - Retorna página principal");
		System.out.println("Digite a opção desejada: ");
		System.out.println("");
		
		int opcoeslancamento = scan.nextInt();
		
		if(opcoeslancamento == 1) {
			cardapio.mcClub();
		}
		else if (opcoeslancamento == 2) {
			cardapio.caldoFreddoMaca();
		}
		else if (opcoeslancamento == 3) {
			cardapio.mcFlurryPrestigioCaramelo();
		}
		else if (opcoeslancamento == 4) {
			cardapio.mcFlurryPrestígioChocolate();
		}
		else if (opcoeslancamento == 5) {
			cardapio.mcFlurryPrestígioMorango();
		}
		else if (opcoeslancamento == 0) {
			home.main(null);
		}
		
	}

}
