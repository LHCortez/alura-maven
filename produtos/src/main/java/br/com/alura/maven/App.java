package br.com.alura.maven;

public class App {
	public static void main(String[] args) {

		Produto produto = new Produto("Lollo", 2.00);

		System.out.println(
				"O doce que eu gosto é: " + produto.getNome() + ", que custa R$ " + produto.getPreco() + " reais.");

	}
}
