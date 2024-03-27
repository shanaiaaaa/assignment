import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit4_231 {

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
    public void testCountDigits_PositiveNumber() {
        assertEquals(5, q4_231.countDigits(12345));
    }

    @Test
    public void testCountDigits_NegativeNumber() {
        assertEquals(4, q4_231.countDigits(-9876));
    }

}
