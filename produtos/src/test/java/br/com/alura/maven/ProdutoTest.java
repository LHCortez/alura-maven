package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto chocolate = new Produto ("Lollo", 2.00);
		assertEquals(2.20, chocolate.getPrecoComImposto(), 0.00001);
	}
	
 
}
