import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test4 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void exceptionTesting() {
		IndexOutOfBoundsException thrown =
	        assertThrows(IndexOutOfBoundsException.class, () -> new ArrayList<Object>().get(0));

	    assertTrue(thrown.getMessage().contains("Index: 0, Size: 0"));
	}

}
