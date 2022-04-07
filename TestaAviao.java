package br.com.generation.poo;

public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Aviao passageiro = new Aviao();
		
		passageiro.dataviagem = "26/12/2022";
		passageiro.passageiro = "Cipriana Luís";
		passageiro.RG = "1714755";
		passageiro.numeroDoVoo = "0233";
		passageiro.destino = "Angola";
		
		passageiro.dadosPassageiroVoo();
	}

}
