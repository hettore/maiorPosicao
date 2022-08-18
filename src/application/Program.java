package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.print("Maior valor: ");
		
		double numeroMaior = vetor[0];
		int posicaoMaior = 0;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > numeroMaior ) {
				numeroMaior = vetor[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf(" %.1f%n ",numeroMaior);
		System.out.println();
		System.out.print("Posição do maior valor: ");
		System.out.print(posicaoMaior);
		sc.close();
	}

	
}
