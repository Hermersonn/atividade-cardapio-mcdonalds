package cardapioMcdonalds;

import java.util.Scanner;

public class Cardapio {
	Home home = new Home();
	Scanner scan = new Scanner(System.in);
		
	public void mcClub() {
		System.out.println("McClub...............R$27,90");
		System.out.println("767 kcal");
		System.out.println("Sanduíche composto por pão tipo brioche, bacon crispy, molho especial, carne 100% bovina, queijo sabor emental, tomate e alface");
		System.out.println("");
		System.out.println("Selecione a opção desejada");
		System.out.println("1 - Fazer pedido: ");
		System.out.println("\t0 - Retorna para a página inicial: ");
		int opcaoCardapio = scan.nextInt();
		if (opcaoCardapio == 0) {
			home.main(null);
		}
		//else if (opcaoCardapio == 1) 
			//Home.main(null);*/
		
	}
	
	public void caldoFreddoMaca() {
		System.out.println("Caldo Freddo & Maça...............R$18,90");
		System.out.println("410 kcal");
		System.out.println("Sobremesa composta por massa gelada de baunilha, calda de maçã com toque de	canela e torta de maçã.");
	
	}
	
	public void mcFlurryPrestigioCaramelo() {
		System.out.println("McFlurry Prestígio Caramelo...............R$18,90");
		System.out.println("487 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa	gelada de baunilha, cobertura de caramelo e bombom recheado com	coco coberto com chocolate ao leite Prestígio ®");
	}
	
	public void mcFlurryPrestígioChocolate() {
		System.out.println("McFlurry Prestígio Chocolate...............R$18,90");
		System.out.println("480 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa gelada de baunilha, cobertura sabor chocolate e bombom recheado com coco coberto com chocolate ao leite Prestígio ®");
	}
	
	public void mcFlurryPrestígioMorango() {
		System.out.println("McFlurry Prestígio Morango...............R$18,90");
		System.out.println("463 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com massa gelada de baunilha, cobertura de morango e bombom recheado com coco coberto com chocolate ao leite Prestígio ®");
	}
	
	public void bigMac() {
		System.out.println("...............R$18,90");
		System.out.println("503 kcal");
		System.out.println("Dois hambúrgueres (100% carne bovina), alface americana, queijo sabor cheddar, 	molho especial, cebola, picles e pão com gergelim.");
	}
	
	public void duploBurguerQueijo() {
		System.out.println("Duplo Burguer com Queijo...............R$18,90");
		System.out.println("478 kcal");
		System.out.println("Dois hambúrgueres, uma explosão de sabor. Dois deliciosos hambúrgueres de carne	100% bovina, queijo sabor cheddar derretido, picles, cebola picada, ketchup, mostarda e pão com gergelim.");
	}
	
	public void quarteraoQueijo() {
		System.out.println("Quarterão com Queijo...............R$18,90");
		System.out.println("523 kcal");
		System.out.println("Um hambúrguer (100% carne bovina), queijo sabor cheddar, picles, cebola, ketchup, mostarda e pão com gergelim.");
	}
	
}
