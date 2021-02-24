package LISTA1;
import java.util.Scanner;

/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 * */
public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int segundosLidos, horas, minutos, segundos;
		
		System.out.println("Digite o tempo em segundos: ");
		segundosLidos = ler.nextInt();
		
		horas = segundosLidos/3600;
		minutos = (segundosLidos%3600)/60;
		segundos = (segundosLidos%3600)%60;
		
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
	}
}
