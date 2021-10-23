import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
	 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double horasTrabalho;
		int diasTrabalhado;
		System.out.println("Horas trabalhadas por dia ::::");
		horasTrabalho = leitor.nextDouble();
		System.out.println("Dais trabalhados na semana ::::");
		diasTrabalhado = leitor.nextInt();
		
		
		
		System.out.println("O salário final ::: "+calculoSalario(calculoTempoTrabalhado(horasTrabalho, diasTrabalhado)));
		
		leitor.close();
	}

	private static double calculoTempoTrabalhado(double horasTrabalho, int diasTrabalhado) {
		double hora = 60, aula = 50, calculo;
		calculo = horasTrabalho*hora;
		calculo= calculo/aula;
		return calculo*diasTrabalhado;
		
	}

	private static double calculoSalario(double calculo) {
		double aulasSemanais = 4.5, salario, valorHora = 10.0;
		salario = calculo*aulasSemanais*valorHora;
		
		return salario*4;
	}
}
