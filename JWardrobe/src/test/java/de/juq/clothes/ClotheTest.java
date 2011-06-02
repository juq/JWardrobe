package de.juq.clothes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.juq.clothes.Clothe;
import de.juq.clothes.ClotheColor;

public class ClotheTest {

	@Test
	public void testGetColor() throws Exception {
		assertEquals(true, new Clothe().getColor() instanceof ClotheColor);
	}
}
