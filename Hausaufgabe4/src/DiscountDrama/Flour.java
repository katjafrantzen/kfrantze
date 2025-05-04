package DiscountDrama;

public class Flour extends PopularGrocery {
	
	public Flour(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		setQuantity(quantity);
		setDiscountThreshold(discountThreshold);
		setHouseholdLimit(15);
	}

	@Override
	public int getBulkDiscount() {
		if (getQuantity() >= getDiscountThreshold()) {
			return 5;
		} else {
			return 0;
		}
	}

}
