
//c)Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500. 

package manzano;

public class Manzano1c {

	public static void main(String[] args) {

		int valor = 1;
		int soma = 0;

		while (valor < 501) {
			valor++;
			if (valor % 2 == 0) {
				soma += valor;
			}
		}
		System.out.println(soma);
	}

}
