import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XX {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

		@Test
		public void testExceptionMessage()  {
		    try {
		        new ArrayList<Object>().get(0);
		        fail("Expected an IndexOutOfBoundsException to be thrown");
		    } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
		        assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
		    }
		}
		/*
		@Test(expected = IndexOutOfBoundsException.class)
		public void testExceptionMessage2() throws Exception{
		        new ArrayList<Object>().get(0);
		      

		}*/
		
		@Test
		void exceptionTesting() {
			IndexOutOfBoundsException thrown =
		        assertThrows(IndexOutOfBoundsException.class, () -> new ArrayList<Object>().get(0));

		    assertTrue(thrown.getMessage().contains("Index: 0, Size: 0"));
		}
	}


