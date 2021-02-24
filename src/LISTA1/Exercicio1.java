package LISTA1;
import java.util.Scanner;

public class Exercicio1 {
		public static void main(String args[]) {
			int ano, mes, dia, diasTotais;
			final int diaAtual = 24, mesAtual = 02, anoAtual = 2021; 
			
			Scanner ler = new Scanner(System.in);
					
			System.out.println("Digite a sua idade");
			System.out.print("Anos: ");
			ano = ler.nextInt();
			
			System.out.print("Meses: ");
			mes = ler.nextInt();
			
			System.out.print("Dia: ");
			dia = ler.nextInt();
			
			
			diasTotais = (ano * 365) + (mes * 30)+dia;
			
			System.out.printf("Dias Totais: %d", diasTotais);
		}
}
