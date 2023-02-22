package cardapioMcdonalds;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		Lancamentos lancamentos = new Lancamentos();
		SanduichesPremium sanduichesPremium = new SanduichesPremium();
		
		System.out.println("******************HOME****************************");
		System.out.println("");
		System.out.println("Selecione uma opção");
		System.out.println("");
		System.out.print("1 - Cardapio");
		System.out.println("\t2- Lancamentos\n");
		int home = scan.nextInt();
		
		switch (home) {
		case 1:
			System.out.println(" 1 - Lançamentos");
			System.out.println(" 2 - Sanduíches Premium");
			System.out.println(" 3 - Sanduíches de Carne Bouvina");
			System.out.println(" 4 - Familia Tasty");
			System.out.println(" 5 - Sanduíches de Frango ");
			System.out.println(" 6 - McLanche Feliz");
			System.out.println(" 7 - Méqui 1000");
			System.out.println(" 8 - Acompanhamentos");
			System.out.println(" 9 - Sobremesas");
			System.out.println("10 - Café da Manhã");
			System.out.println("11 - McOferta");
			System.out.println("12 - Méqui Box");
			System.out.println("");
			System.out.println("Digite a opção desejada: ");
			int homeOpcoes = scan.nextInt();
			{
				switch (homeOpcoes) {
				case 1:
					lancamentos.lancamentosHome();
					break;
				case 2: 
					sanduichesPremium.sanduichesPremiumHome();
				break;
				case 3:
					//Sanduíches de Carne Bouvina
					break;
				/*case 4:
					//Familia Tasty
					break;
				case 5:
					//Sanduíches de Frango
					break;
				case 6:
					//McLanche Feliz
					break;
				case 7:
					//Méqui 1000
					break;
				case 8:
					//Acompanhamentos
					break;
				case 9:
					//Sanduíches de Carne Bouvina
					break;
				case 10:
					//Sanduíches de Carne Bouvina
					break;
				case 11:
					//Sanduíches de Carne Bouvina
					break;
				case 12:
					//Sanduíches de Carne Bouvina
					break;*/
				}
			}
			
		}
	}
}
