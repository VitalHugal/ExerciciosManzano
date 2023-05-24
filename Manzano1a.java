package manzano;

import java.util.Scanner;

public class Manzano1a {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor = 0;
		int vezes = 1;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		
		while(vezes<=10 ) {
			System.out.println(valor +" X "+ vezes+ " "+ " = "+ " "+ (valor*vezes));
			vezes++;
		}
	}

}
