package eCommerceModule;

public class Profile {

	private ShippingInfo shippingInfo;
	
	

	public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException{
		this.shippingInfo = shippingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) throws MissingShippingInfoException{
		if(shippingInfo == null) {
			throw new MissingShippingInfoException("Profile is missing shipping info");
		}
		this.shippingInfo = shippingInfo;
	}
	
	
}
