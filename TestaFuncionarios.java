package br.com.generation.poo;

public class TestaFuncionarios {

	public static void main(String[] args) {

        Funcionarios colaborador1 = new Funcionarios();
		
		colaborador1.nome = "Cipriana Lís";
		colaborador1.funcao = "CEO";
		colaborador1.horasTrabalhadas = 120;
		colaborador1.minhoras = 100;
		colaborador1.valorhora = 33;
		
		colaborador1.funcionario();
		colaborador1.salario();
	}

}
