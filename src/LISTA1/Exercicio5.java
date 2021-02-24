package LISTA1;
import java.util.Scanner;

/*
 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 * */
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2, nota3, soma;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextInt();
		
		soma = (nota1*2)+(nota2*3)+(nota3*5);
		System.out.println("A média é: ");
		System.out.println(soma/10);
		}
}
