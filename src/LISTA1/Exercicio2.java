package LISTA1;
import java.util.Scanner;

/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 * */
public class Exercicio2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int diasLidos, anos, meses, dias;
		
		System.out.println("Digite o n�mero de dias de vida: ");
		diasLidos = ler.nextInt();
		
		anos = diasLidos/365;
		meses = (diasLidos%365)/30;
		dias = (diasLidos%365)%30;
		
		System.out.printf("Voc� tem dias: %d / meses: %d / anos: %d", dias, meses, anos);
	}
}
