import java.util.Scanner;

public class Desafio02 {
	/*Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de 100 (com exce��o dos anos que forem m�ltiplos de 400).
Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto� ou �O ano informado n�o � bissexto).
A main do seu programa deve conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto retornado.


	 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int anoInformado;
		System.out.println("Digite o ano :::");
		anoInformado = leitor.nextInt();
		
		if(validaAno(anoInformado)==true) {
			System.out.println("O ano "+ anoInformado + " � bissexto");
		}else {
			System.out.println("O ano "+ anoInformado + " n�o � bissexto");
		}
		leitor.close();
	}

	private static boolean validaAno(int anoInformado) {
		if ((anoInformado%4==0 && (anoInformado%100!=0)) || anoInformado%400==0) {
			return true;
		}
		return false;
	}

}
