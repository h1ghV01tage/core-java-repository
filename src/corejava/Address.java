package corejava;

public class Address implements Cloneable {

	//declare the fields for the address class
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	//declare the Ctor for address
	public Address() {
		
		
	}
	
	//override Ctor
	public Address(String street, String city, String state, String zipCode) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
	}
	
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getAddress() {
		
		return this.street + "\n"
				+ this.city + "\n"
				+ this.state + "\n"
				+ this.zipCode;
		
	}
	
	
	
}
