package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {
	CalculatorService cs=new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(100, cs.sum());
	}
 
	@Test
	public void testSubstract() {
		Assertions.assertEquals(20, cs.substract());
	}
	
	@Test
	public void testMultiply() {
		Assertions.assertEquals(2400, cs.multiply());
	}
	
	@Test
	public void testDivision() {
		Assertions.assertEquals(1, cs.division());
	}
	
	@Test
	public void testSquare() {
		Assertions.assertEquals(25, cs.square());
	}
}
