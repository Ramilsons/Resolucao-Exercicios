package LISTA1;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicio8 {

	public static void main(String[] args) {
		double valorCarro;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o custo de f�brica: ");
		valorCarro = ler.nextDouble();
	
		valorCarro = ((valorCarro * 0.28)+(valorCarro * 0.45))+valorCarro;
		
		System.out.print("Valor ao consumidor �: "+ valorCarro);
		
		
	}

}
