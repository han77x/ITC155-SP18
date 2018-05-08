package Assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	class writeCharsTest {

	@Test
	public void substringCheck() {
		// Setting input parameters:
			String a = "*";
			String b = "**";
			String c = "<";
			String d = ">";
			String e = new String(a);
			
			assertTrue(e.equals(a));
	        assertFalse(e == a);
	        assertEquals(e, a);
		}	
			
		}
		
	


