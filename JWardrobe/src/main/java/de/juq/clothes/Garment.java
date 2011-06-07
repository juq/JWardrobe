package de.juq.clothes;

import de.juq.clothes.characteristics.Age;
import de.juq.clothes.characteristics.BodyPart;
import de.juq.clothes.characteristics.Brand;
import de.juq.clothes.characteristics.GarmentColor;
import de.juq.clothes.characteristics.GarmentColorImpl;
import de.juq.clothes.characteristics.GarmentStyle;
import de.juq.clothes.characteristics.Material;
import de.juq.clothes.characteristics.PurchaseDate;
import de.juq.clothes.characteristics.Season;
import de.juq.clothes.characteristics.Size;

public class Garment {
	
	public Garment() {
		// TODO Auto-generated constructor stub
	}

	public Garment(PurchaseDate purchaseDate) {
		super();
	}

	public GarmentColor getColor() {
		return new GarmentColorImpl();
	}

	public Size getSize() {
		return new Size() {
		};
	}

	public PurchaseDate getDateOfPurchase() {
		return new PurchaseDate() {
		};
	}

	public Age getAge() {
		return new Age() {
		};
	}

	public Brand getBrand() {
		return new Brand() {
		};
	}

	public Material getMaterial() {
		return new Material() {
		};
	}

	public Season getSeason() {
		return new Season() {
		};
	}

	public GarmentStyle getStyle() {
		return new GarmentStyle() {
		};
	}

	public BodyPart getBodyPart() {
		return new BodyPart() {
		};
	}

}
