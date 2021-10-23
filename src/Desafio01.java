import java.util.Scanner;

public class Desafio01 {
	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

	 * */
	
	public static boolean validarEstado(String estadoInformado){
		String estados[] = {"DF","ES","MG","RJ","SC","SP","AC","AL","AM","BA","CE","GO","MA","PA","PE","PI","RO","SE","TO","MS","RN","RS","AP","MT","PB","PR","RR"};
		
		for (int i = 0; i < estados.length; i++) {
			if(estados[i].equalsIgnoreCase(estadoInformado))
				return true;
		}
		return false;		 
	}
	
	public static void main(String[] args) {
		/*A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.*/
		
		Scanner leitor = new Scanner(System.in);
		String estado;
		System.out.println("Digite a sigla do estado que pertence :::");
		estado = leitor.next();
		
		validarEstado(estado);
		
		if (validarEstado(estado) == true) {
			System.out.println("Estado encontrado!");
		}else {
			System.out.println("Estado não encontrado!");
		}
		
		leitor.close();
		
	}
}
