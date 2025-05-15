package eCommerceModule;

public class Customer {
	private Profile profile;
	private int id;
	
	
	
	public Customer(Profile profile, int id) throws InvalidCustomerException{
		this.profile = profile;
		this.id = id;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) throws InvalidCustomerException{
		if(profile == null) {
			throw new InvalidCustomerException("Customer is missing profile");
		}
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) throws InvalidCustomerException{
		if(id < 0 ) {
			throw new InvalidCustomerException("Customer ID cannot be negative");
		}
		this.id = id;
	}
	
	

}
