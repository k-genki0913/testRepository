package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxTest {

	@Test
	void testTaxIn() {
		Tax tax = new Tax();
		assertEquals(1100, tax.taxIn(1000));
	}

}
