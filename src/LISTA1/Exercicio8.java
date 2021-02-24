package LISTA1;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicio8 {

	public static void main(String[] args) {
		double valorCarro;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica: ");
		valorCarro = ler.nextDouble();
	
		valorCarro = ((valorCarro * 0.28)+(valorCarro * 0.45))+valorCarro;
		
		System.out.print("Valor ao consumidor é: "+ valorCarro);
		
		
	}

}
