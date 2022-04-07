package br.com.generation.poo;

public class TestaCliente {

	public static void main(String[] args) {

        Cliente primeiroCliente = new Cliente();
		
		primeiroCliente.nome = "Cipriana Luís ";
		primeiroCliente.CPF = "238.896.228-52";
		primeiroCliente.dataDeNacimento = "18/03/1997";
		primeiroCliente.extrato = 0;
		
		primeiroCliente.compras = 300;
		
		primeiroCliente.registro();
		primeiroCliente.compras();
	}

}
