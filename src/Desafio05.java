import java.util.Scanner;

public class Desafio05 {
/*A rede de supermercados MercaJava está levando a sério as restrições de isolamento social no Brasil. Estão trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que estão atendendo às solicitações.
Toda a identificação das medidas necessárias é feita através de câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
As funções são:
•	Temperatura: Clientes com temperatura superior a 37,0 graus não podem entrar no estabelecimento.
•	Máscara: Clientes sem máscara não podem entrar no estabelecimento.
•	Famílias: grupos com mais de 2 pessoas não podem entrar no estabelecimento.
•	Função agregadora: só autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
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
			System.out.println("Verificação Mascara :::: (SIM/NÃO)");
			validadorMascara = leitor.next();
		}else {
			System.out.println("Temperatura acima do permitido!");
		}
		
		boolean verificaMascara = validarMascara(validadorMascara);
		
		if(verificaMascara == true) {
			System.out.println("Verificação Quantidades de pessoas :::: ");
			validadorQuantidadesPessoas = leitor.nextInt();
		}else {
			System.out.println("Não é permitido a entrada sem mascara na MercaJava");
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
