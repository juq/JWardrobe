package de.juq.clothes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.juq.clothes.Garment;
import de.juq.clothes.GarmentColor;

public class GarmentTest {

	@Test
	public void testGetColor() throws Exception {
		assertEquals(true, new Garment().getColor() instanceof GarmentColor);
	}
}
