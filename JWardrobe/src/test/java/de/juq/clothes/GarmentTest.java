package de.juq.clothes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.juq.clothes.characteristics.Age;
import de.juq.clothes.characteristics.BodyPart;
import de.juq.clothes.characteristics.Brand;
import de.juq.clothes.characteristics.GarmentColor;
import de.juq.clothes.characteristics.GarmentStyle;
import de.juq.clothes.characteristics.Material;
import de.juq.clothes.characteristics.PurchaseDate;
import de.juq.clothes.characteristics.Season;
import de.juq.clothes.characteristics.Size;

public class GarmentTest {

	@Test
	public void testConstructor() throws Exception {
		new Garment(new PurchaseDate() {
		});
	}

	@Test
	public void testColor() throws Exception {
		assertEquals(true, new Garment().getColor() instanceof GarmentColor);
	}

	@Test
	public void testSize() throws Exception {
		assertEquals(true, new Garment().getSize() instanceof Size);
	}

	@Test
	public void testDateOfPurchase() throws Exception {
		assertEquals(true,
				new Garment().getDateOfPurchase() instanceof PurchaseDate);
	}

	@Test
	public void testAge() throws Exception {
		assertEquals(true, new Garment().getAge() instanceof Age);
	}

	@Test
	public void testCalculateAge() throws Exception {
		new Garment(new PurchaseDate() {
		});
	}

	@Test
	public void testBrand() throws Exception {
		assertEquals(true, new Garment().getBrand() instanceof Brand);
	}

	@Test
	public void testMaterial() throws Exception {
		assertEquals(true, new Garment().getMaterial() instanceof Material);
	}

	@Test
	public void testSeason() throws Exception {
		assertEquals(true, new Garment().getSeason() instanceof Season);
	}

	@Test
	public void testStyle() throws Exception {
		assertEquals(true, new Garment().getStyle() instanceof GarmentStyle);
	}

	@Test
	public void testBodyPart() throws Exception {
		assertEquals(true, new Garment().getBodyPart() instanceof BodyPart);
	}
}
