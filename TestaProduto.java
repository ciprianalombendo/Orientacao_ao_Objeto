package br.com.generation.poo;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		p1.nomeProduto = "Iphone 12";
		p1.armazenamento = "256 GB";
		p1.RAM = "12GB";
		p1.valor = 5000.00;
		p1.dadosmoveis = "8G";
		
		p1.descricao();
		p1.promoção();

		p2.nomeProduto = "Iphone 11 pro max";
		p2.armazenamento = "128 GB";
		p2.RAM = "8GB";
		p2.valor = 4000.00;
		p2.dadosmoveis = "8G";
		
		p2.descricao();
		p2.promoção();

	}

}
