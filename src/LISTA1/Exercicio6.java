package LISTA1;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de x1: ");
		x1 = ler.nextInt();
		System.out.print("Digite o valor de y1: ");
		y1 = ler.nextInt();
		System.out.print("Digite o valor de x2: ");
		x2 = ler.nextInt();
		System.out.print("Digite o valor de y2: ");
		y2 = ler.nextInt();
	
		D = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
		
		//Math.round para arredondar
		System.out.println("A distância entre eles é: "+ Math.round(D));
	}
}
