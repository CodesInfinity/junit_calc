package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After ALL");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before EACH");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After EACH");
	}
	
	@Test
	void testSuma() {
		int valorEsperado = 3;
		int sum = Calculadora.suma(1, 2);
		assertEquals(valorEsperado, sum);
	}

	@Test
	void testResta() {
		int valorEsperado = 3;
		int res = Calculadora.resta(5, 2);
		assertEquals(valorEsperado, res);	}
	
	@Test
	void testMultiplicacion() {
		int valorEsperado = 3;
		int mul = Calculadora.multiplicacion(1, 3);
		assertEquals(valorEsperado, mul);	}
	
	@Test
	void testDivision() {
		int valorEsperado = 3;
		int div = Calculadora.division(6, 2);
		assertEquals(valorEsperado, div);	
	}
	
	@Test
	void testDivideCero() {
		int valorEsperado = -1;
		int div = Calculadora.division(10, 0);
		assertEquals(valorEsperado, div);
	}
	
}
