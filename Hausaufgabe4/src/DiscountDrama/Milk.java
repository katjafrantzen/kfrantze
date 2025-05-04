package DiscountDrama;

public class Milk extends PopularGrocery {

	public Milk(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		setDiscountThreshold(discountThreshold);
		setQuantity(quantity);
		setHouseholdLimit(20);
	}

	@Override
	public int getBulkDiscount() {
		if (getQuantity() >= getDiscountThreshold()) {
			return 12;
		} else {
			return 0;
		}
	}

}
