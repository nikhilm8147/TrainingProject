package TestPackage;
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import org.junit.Test;

@Ignore
class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Before
	void before() {
		System.out.println("before statemnet");
	}
	
	@After
	void after() {
		System.out.println("after statemnet");
	}
	
	
	@Test
	void testsub() {
		assertEquals(2, calc.sub(4, 2));
	}
	
	@Test
	void testmul() {
		assertTrue(10 == calc.mul(5, 2));
	}

   
    @Test
	void testaddd() {
		assertSame(6, calc.add(4, 2));
		assertNotSame(6, calc.add(3, 2));
		System.out.println("add");
	}
	
	@Test
	void testdiv() {
	//	string n = null;
	//S	assertNull(n);
		
		int a[]= { 1, 2, 3 };					
        int b[] = { 1, 2, 3 };
        
        assertArrayEquals(a, b);
	}

}
