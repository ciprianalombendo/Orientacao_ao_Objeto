package br.com.generation.poo;

public class Funcionarios {
	
	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	instancias deste objeto e apresente as informa��es deste objeto no
	console.*/

		String nome;
		String funcao;
		double horasTrabalhadas;
		double valorhora;
		double salario;
		double minhoras;
		double horasextras;
		double salarioextra;
		
		void funcionario() {
			System.out.println("Dados do colaborador: ");
			System.out.println("\nNome: " + nome);
			System.out.println("Fun��o: " + funcao);
		}
		void salario() {
			
			if(horasTrabalhadas>minhoras) {
				horasextras = horasTrabalhadas - minhoras;
				salarioextra = (2*valorhora) * horasextras;
				
				System.out.println("\nVoc� Possui horas extras!!!");
			}else {
				
			}
			
			salario = (valorhora * horasTrabalhadas) + salarioextra;
			
			System.out.println("Seu sal�rio �: R$" + salario);

}
}