import static org.junit.Assert.*;

import org.junit.Test;

public class ValoresTest {

	@Test
	public void testIns() {
				
		Valores v = new Valores();
		
		boolean resultado = v.ins(10);
				
		assertTrue(resultado);
		
	}

	@Test
	public void testDel() {
		
		Valores v = new Valores();
				
		v.ins(3);
		v.ins(4);
		v.ins(5);
		v.del(1);
		int tamanho = v.size();
		int esperado = 2;
		
		assertEquals(esperado, tamanho);
		
		
	}

	@Test
	public void testSize() {
		
		Valores v = new Valores();
		
		v.ins(1);
		v.ins(2);
		v.ins(3);
		
		int esperado = 3;
		
		int tamanho = v.size();
		
		assertEquals(esperado, tamanho);
		
	}

	@Test
	public void testMean() {
		
		Valores v = new Valores();
		
		v.ins(5);
		v.ins(3);
		
		int resultado = (int) v.mean();
		int esperado = 4;
		
		assertEquals(esperado, resultado);
		
		
	}

	@Test
	public void testGreater() {
		
		Valores v = new Valores();
		
		v.ins(2);
		v.ins(3);
		v.ins(4);
		
		int esperado = 4;
		int resultado = v.greater();
		
		assertEquals(esperado, resultado);
		
		
	}

	@Test
	public void testLower() {
		
Valores v = new Valores();
		
		v.ins(2);
		v.ins(3);
		v.ins(4);
		
		int esperado = 2;
		int resultado = v.lower();
		
		assertEquals(esperado, resultado);
		
		
	}

}
