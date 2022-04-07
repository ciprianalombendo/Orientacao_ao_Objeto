package br.com.generation.poo;

public class Patinete {

	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
		
		String modelo;
		int velociodade;
		String indicacaoIdade;
		String suportePeso;
		
		void dados() {
			System.out.println("Dados do Patinete: ");
			System.out.println("\nModelo: " + modelo);
			System.out.println("Indicado para adultos de: " + indicacaoIdade);
			System.out.println("Susporta: " + suportePeso);
}
}
