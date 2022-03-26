package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		MyUnit myUnit = new MyUnit();
		assertEquals("Result", "AdritaPal", myUnit.stringConcat("Adrita", "Pal"));
	}

}