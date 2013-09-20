package TesteConta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Conta.ContaNaoConfiavel;
import Conta.Contas;

public class TesteContaNaoConfiavel {

Contas umaConta;
ContaNaoConfiavel umaContaNaoConfiavel;
	
	@Before
	public void setUp() throws Exception {
		umaConta = new Contas();
		umaContaNaoConfiavel = new ContaNaoConfiavel();
	}

	
	@Test
	public void testCalculaQuadrado(){
		assertEquals(umaConta.calculaQuadrado(0.0),umaContaNaoConfiavel.calculaQuadrado(0.0),0.001);
	}
	@Test
	public void testCalculaQuadrado1(){
		assertEquals(umaConta.calculaQuadrado(0.02), umaContaNaoConfiavel.calculaQuadrado(0.02),0.000001);
	}
	@Test
	public void testCalculaQuadrado2(){
		assertEquals(umaConta.calculaQuadrado(-0.02), umaContaNaoConfiavel.calculaQuadrado(-0.02),0.00001);
	}
	@Test
	public void testCalculaQuadrado3(){
		assertEquals(umaConta.calculaQuadrado(105.9), umaContaNaoConfiavel.calculaQuadrado(105.9),0.001);
	}
	@Test
	public void testCalculaQuadrado4(){
		assertEquals(umaConta.calculaQuadrado(-105.9), umaContaNaoConfiavel.calculaQuadrado(-105.9), 0.001);
	}
	@Test
	public void testCalculaCubo(){
		assertEquals(umaConta.calculaQuadrado(0.0),umaContaNaoConfiavel.calculaQuadrado(0.0),0.001);
	}
	@Test
	public void testCalculaCubo1(){
		assertEquals(umaConta.calculaCubo(0.02), umaContaNaoConfiavel.calculaQuadrado(0.02),0.00000001);
	}
	@Test
	public void testCalculaCubo2(){
		assertEquals(umaConta.calculaCubo(-0.02),umaContaNaoConfiavel.calculaQuadrado(-0.02), 0.00000001);
	}
	@Test
	public void testCalculaCubo3(){
		assertEquals(umaConta.calculaCubo(105.9), umaContaNaoConfiavel.calculaQuadrado(105.9), 0.001);
	}
	@Test
	public void testCalculaCubo4(){
		assertEquals(umaConta.calculaCubo(-105.9), umaContaNaoConfiavel.calculaQuadrado(-105.9), 0.001);
	}

}
