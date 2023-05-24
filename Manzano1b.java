package manzano;

public class Manzano1b {

	public static void main(String[] args) {

		int valor = 0;
		int num = 1;
		int resultado = 0;

		while (num <= 100) {
			resultado = valor + num;
			num++;
			valor = resultado;

		}
		System.out.println(resultado);
	}

}
