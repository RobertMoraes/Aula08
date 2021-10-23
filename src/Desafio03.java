import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double l1,l2,l3;
		System.out.println("Primeiro lado :::");
		l1 = leitor.nextDouble();
		System.out.println("Segundo lado :::");
		l2 = leitor.nextDouble();
		System.out.println("Terceiro lado :::");
		l3 = leitor.nextDouble();
		
		if(validaTriangulo(l1,l2,l3)==true) {
			TipoTriangulo(l1,l2,l3);
		}else {
			System.out.println("Triangulo inexistente.");
		}
		leitor.close();
	}

	private static void TipoTriangulo(double l1, double l2, double l3) {
		
		if(l1==l2 && l2==l3) {
			System.out.println("Triangulo equilatero.");
		}else if(l1==l2 || l2==l3 || l3==l1) {
			System.out.println("Triangulo isosceles.");
		}else {
			System.out.println("Triangulo escaleno.");
		}		
	}

	private static boolean validaTriangulo(double l1, double l2, double l3) {

		if(((l1-l2)<l3 && l3<(l1+l2))||((l3-l2)<l1 && l1<(l3+l2))||((l1-l3)<l2 && l2<(l1+l3))) {
			
			return true;
			
		}
		
		return false;
		
	}
}
