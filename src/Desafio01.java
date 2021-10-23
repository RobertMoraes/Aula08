import java.util.Scanner;

public class Desafio01 {
	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

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
		/*A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.*/
		
		Scanner leitor = new Scanner(System.in);
		String estado;
		System.out.println("Digite a sigla do estado que pertence :::");
		estado = leitor.next();
		
		validarEstado(estado);
		
		if (validarEstado(estado) == true) {
			System.out.println("Estado encontrado!");
		}else {
			System.out.println("Estado n�o encontrado!");
		}
		
		leitor.close();
		
	}
}
