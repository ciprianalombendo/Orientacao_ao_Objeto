package br.com.generation.poo;

public class Produto {
	/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.*/

		double valor;
		String nomeProduto;
		String RAM;
		String armazenamento;
		double promocao = 0;
		String dadosmoveis;
		
		void descricao() {
			System.out.println("Dados do produto: ");
			System.out.println("\nO seu produto �: " + nomeProduto + " " + dadosmoveis );
			System.out.println("Capacidade de armazenamento: " + armazenamento);
			System.out.println("Mem�ria RAM: " + RAM);
			
		}
		void promo��o () {
			if(valor>=5000) {
				promocao = valor - (valor* 0.10);
				System.out.println("\nEste produto est� na promo��o e o novo valor � " + promocao);
				System.out.println();
			}else {
				System.out.println("Infelizmente este produto n�o est� na promo��o.");

}
		}
}
