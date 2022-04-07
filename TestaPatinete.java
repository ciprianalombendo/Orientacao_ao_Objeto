package br.com.generation.poo;

public class TestaPatinete {

	public static void main(String[] args) {

        Patinete patinete1 = new Patinete();
		
		patinete1.modelo = "G23129X";
		patinete1.indicacaoIdade ="25 anos";
		patinete1.suportePeso = "75 Kg";
		
		patinete1.dados();
	}

}
