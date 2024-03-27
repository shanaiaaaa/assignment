import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit3_231 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("0 1 1 2 3 ", getFibonacciSeries(5));
    }

    @Test
    public void testFibonacciSeries_10Terms() {
        assertEquals("0 1 1 2 3 5 8 13 21 34 ", getFibonacciSeries(10));
    }

    private String getFibonacciSeries(int n) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        q3_231.display(n);
        return outContent.toString();}

}
