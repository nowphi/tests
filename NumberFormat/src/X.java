import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class X {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	void exceptionTesting() {
		IndexOutOfBoundsException thrown =
	        assertThrows(IndexOutOfBoundsException.class, () -> new ArrayList<Object>().get(0));

	    assertTrue(thrown.getMessage().contains("Index: 0, Size: 0"));
	}
}
