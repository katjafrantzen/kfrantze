package DiscountDrama;

public abstract class PopularGrocery extends GroceryItem {

	private int popularityLevel;
	private int quantity;

	public PopularGrocery(int popularityLevel) {
		setPopular(true);
		setPopularityLevel(popularityLevel);
	}

	@Override
	public boolean showWarning() {
		return getQuantity() > getHouseholdLimit();
	}

	public int getPopularityLevel() {
		return popularityLevel;
	}

	public void setPopularityLevel(int popularityLevel) {
		this.popularityLevel = popularityLevel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
