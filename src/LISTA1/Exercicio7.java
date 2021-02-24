package LISTA1;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String args[]) {
		int a, b, c, d, e, f, x, y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		c = ler.nextInt();
		System.out.print("Digite o valor de D: ");
		d = ler.nextInt();
		System.out.print("Digite o valor de E: ");
		e = ler.nextInt();
		System.out.print("Digite o valor de F: ");
		f = ler.nextInt();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f) - (c*d)) / ((a*e)-(b*d));
		
		System.out.printf("Valor de X: %d, valor de Y: %d", x, y);

	}
	
}
