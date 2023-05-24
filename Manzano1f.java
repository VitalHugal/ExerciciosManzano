//f) Elaborar  um  programa  que  apresente  como  resultado  o  valor  de  uma  potência  de  uma  base qualquer elevada 
//a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício 
//não pode ser utilizado o operador de exponenciação do portuguol (^). 

package manzano;

import java.util.Scanner;

public class Manzano1f {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		double B = ler.nextInt();
		System.out.println("Digite o valor do Expoente: ");
		double E = ler.nextInt();

		while (E < E)
			;
		{
			double resultado = Math.pow(B, E);
			E++;
			System.out.println();
			System.out.println("O resultado da potência é: " + resultado);
		}
		ler.close();
	}

}
