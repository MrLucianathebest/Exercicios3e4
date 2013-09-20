package TesteConta;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Conta.Contas;


public class testConta {

	Contas umaConta;
	
	@Before
	public void setUp() throws Exception {
		umaConta = new Contas();
	}


	
	@Test
	public void testCalculaQuadrado(){
		assertEquals(0.0, umaConta.calculaQuadrado(0.0),0.001);
	}
	@Test
	public void testCalculaQuadrado1(){
		assertEquals(0.0004, umaConta.calculaQuadrado(0.02),0.000001);
	}
	@Test
	public void testCalculaQuadrado2(){
		assertEquals(0.0004, umaConta.calculaQuadrado(-0.02),0.00001);
	}
	@Test
	public void testCalculaQuadrado3(){
		assertEquals(11214.81, umaConta.calculaQuadrado(105.9),0.001);
	}
	@Test
	public void testCalculaQuadrado4(){
		assertEquals(11214.81, umaConta.calculaQuadrado(-105.9),0.001);
	}
	@Test
	public void testCalculaCubo(){
		assertEquals(0.0, umaConta.calculaQuadrado(0.0),0.001);
	}
	@Test
	public void testCalculaCubo1(){
		assertEquals(0.000008, umaConta.calculaCubo(0.02),0.00000001);
	}
	@Test
	public void testCalculaCubo2(){
		assertEquals(-0.000008, umaConta.calculaCubo(-0.02),0.00000001);
	}
	@Test
	public void testCalculaCubo3(){
		assertEquals(1187648.38, umaConta.calculaCubo(105.9),0.001);
	}
	@Test
	public void testCalculaCubo4(){
		assertEquals(-1187648.38, umaConta.calculaCubo(-105.9),0.001);
	}

}
