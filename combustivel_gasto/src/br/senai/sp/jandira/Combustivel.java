package br.senai.sp.jandira;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("        CONSUMO DE COMBUSTIVEL       ");
		System.out.println("-------------------------------------");
		
                               
			System.out.print("Modelo do carro?");
			String carro  = teclado.nextLine();
			System.out.print("Autonomia do carro?");
			int auto = teclado.nextInt();
			System.out.print("Distância do carro?");
			int dist = teclado.nextInt();
			System.out.print("Preço do combustível?");
			double  preco = teclado.nextDouble();

			int combustivel = (dist / auto);
			double total = combustivel * preco;
			
			System.out.println("                                      ");
			System.out.println("*************************************");
			System.out.println("             R E S U T A D O");
			System.out.println("*************************************");
			System.out.println("                                      ");	
			
			System.out.println("Modelo do veículo:" + carro);
			System.out.println("Autonomia do veículo: " + auto + " Km/l");
			System.out.println("Distância do veículo: " + dist + " Km");
			System.out.println("Preço do combustível:  R$" + preco);
			
			
			
			System.out.println("                                     ");
			System.out.println("-------------------------------------");
			System.out.println("Quantidade de combustível utilizado:  "+ combustivel +"l");
			System.out.println("Total gasto com a viagem: R$" + total  );
			System.out.println("-------------------------------------");
			System.out.println("                                     ");
			
		
		
	}

}