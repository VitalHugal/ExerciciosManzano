//e) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado  que  qualquer  
//número  elevado  a  zero  é  1,  e  elevado  a  1  é  ele  próprio.  Observe  que neste exercício não pode ser 
//utilizado o operador de exponenciação do portuguol (^).

package manzano;

public class Manzano1e {

	public static void main(String[] args) {

		double base = 3;
		double expoente = 0;
		double resultado = 0;
		
		while(expoente<16) {
			resultado = Math.pow(base, expoente);
			expoente++;
			System.out.println(resultado);
		}
		
	}

}
