package TestPackage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class CalcTest {
	Calculator clc = new Calculator();
	
	
	
	@Before
	public void precon() {
		System.out.println("before method");
	}
	
	@After
	public void postcon() {
		System.out.println("after method");
	}
	
	
	@Ignore
	@Test
	public void testsub() {
		assertEquals(2, clc.sub(4, 2));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testmul() {
		assertTrue(10 == clc.mul(5, 2));
		int k = 10/0;
	}
	
	@Test(timeout=5000)
	public void timout() throws InterruptedException {
		System.out.println("start");
		int i=1;
		while(i>0){
			i++;
			Thread.sleep(1000);
			System.out.println(i);	
		}
		
	}
	
	
}
