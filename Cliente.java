package br.com.generation.poo;

public class Cliente {
	/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/
	 
	String nome;
	String dataDeNacimento;
	String CPF;
	String cadastro;
	double extrato;
	double compras;
	
	void registro () {
			
		cadastro = "\nNome completo: " + nome + "\nCPF: " + CPF + "\nData de nascimento: " + dataDeNacimento;   
		System.out.println("O seu cadastro completo �: " + "\n"+cadastro);
	}
	
	void compras() {
		extrato = compras + extrato;
		System.out.println("Seu extrato �: R$" + extrato);

}
}
