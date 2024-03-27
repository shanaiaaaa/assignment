import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit8_231 {

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
		 q8_231 emp = new q8_231("John", 50000);
	        double expectedDA = 5000; 
	        assertEquals(expectedDA, emp.calculateTotalSalary() - emp.getBasicSalary() - 5000, 100);
	    }

}
