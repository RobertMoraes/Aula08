import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

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
