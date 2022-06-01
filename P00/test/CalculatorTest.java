import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		assertNotNull(cal);
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		assertNotNull(cal);
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiple() {
		int a = 1;
		int b = 9;
		
		Calculator cal = new Calculator();
		assertNotNull(cal);
		int actual = cal.multiple(a, b);
		
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 9;
		int b = 3;
		
		Calculator cal = new Calculator();
		assertNotNull(cal);
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
