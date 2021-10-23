import java.util.Scanner;

public class Desafio05 {
/*A rede de supermercados MercaJava est� levando a s�rio as restri��es de isolamento social no Brasil. Est�o trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s solicita��es.
Toda a identifica��o das medidas necess�rias � feita atrav�s de c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
As fun��es s�o:
�	Temperatura: Clientes com temperatura superior a 37,0 graus n�o podem entrar no estabelecimento.
�	M�scara: Clientes sem m�scara n�o podem entrar no estabelecimento.
�	Fam�lias: grupos com mais de 2 pessoas n�o podem entrar no estabelecimento.
�	Fun��o agregadora: s� autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
*/
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double temperatura;
		String validadorMascara = null;
		int validadorQuantidadesPessoas = 0;
		System.out.println("Temperatura registrada :::: ");
		temperatura = leitor.nextDouble();
		
		boolean validadorTemperatura = medirTemperatura(temperatura);
		
		if(validadorTemperatura == true) {
			System.out.println("Verifica��o Mascara :::: (SIM/N�O)");
			validadorMascara = leitor.next();
		}else {
			System.out.println("Temperatura acima do permitido!");
		}
		
		boolean verificaMascara = validarMascara(validadorMascara);
		
		if(verificaMascara == true) {
			System.out.println("Verifica��o Quantidades de pessoas :::: ");
			validadorQuantidadesPessoas = leitor.nextInt();
		}else {
			System.out.println("N�o � permitido a entrada sem mascara na MercaJava");
		}
		
//		quantiaPessoas();
//		
//		validaEntrada();
		
		
	}

private static boolean validarMascara(String validadorMascara) {
	if(validadorMascara.equalsIgnoreCase("sim")) {
		return true;
	}
	return false;
}

private static boolean medirTemperatura(double temperatura) {
	double validarTemperatura = 37.0;
	if(temperatura<=validarTemperatura) {
		return true;
	}else {
		return false;
	}
}

}
