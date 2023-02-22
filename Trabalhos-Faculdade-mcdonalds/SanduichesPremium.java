package cardapioMcdonalds;

import java.util.Scanner;

public class SanduichesPremium {
	Scanner scan = new Scanner(System.in);
	Cardapio cardapio = new Cardapio();
	Home home = new Home();
	
	
	public void sanduichesPremiumHome () {
	
	System.out.println("************Sanduiches Premium*************");
	System.out.println("");
	System.out.println("1 - Big Mac");
	System.out.println("2 - Duplo Burguer com Queijo");
	System.out.println("3 - Quarterão com Queijo");
	System.out.println("4 - Cheddar McMelt");
	System.out.println("5 - McNífico Bacon ");
	System.out.println("6 - Duplo Quarterão");
	System.out.println("7 - Duplo Cheddar McMelt");
	System.out.println("8 - Duplo Burger Bacon");
	System.out.println("9 - Triplo Cheeseburger");
	System.out.println("10 - Cheeseburger");
	System.out.println("11 - Hamburger");
	System.out.println("12 - McFiesta");
	System.out.println("");
	System.out.println("0 - Retorna página principal");
	System.out.println("Digite a opção desejada: ");
	System.out.println("");
	int opcesSanduichesPremium = scan.nextInt();
	
	if (opcesSanduichesPremium == 0) {
		Home.main(null);
	}
	else if (opcesSanduichesPremium == 1) {
		cardapio.bigMac();
	}
	else if (opcesSanduichesPremium == 2) {
		cardapio.duploBurguerQueijo();
	}
	else if (opcesSanduichesPremium == 3) {
		cardapio.quarteraoQueijo();
	}
	}

}
