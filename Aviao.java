package br.com.generation.poo;

public class Aviao {
	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/

		String numeroDoVoo;
		String passageiro;
		String dataviagem;
		String RG;
		String destino;
		
		void dadosPassageiroVoo() {
			
			System.out.println("Ol�, " + passageiro + "!" );
			System.out.println("\nSua viagem est� marcada para "+ dataviagem); 
			System.out.println("O n�mero do seu voo �: " + numeroDoVoo);
			System.out.println("Seu destino �: " + destino );
			System.out.println("\nTenha uma excelente viagem!");

}
}
