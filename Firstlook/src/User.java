

public class User {
	public User(String firstName, String lastName, String email){
	this.firstName = firstName;
	this.lastName =lastName;
	this.email=email;
	
	}
	private String firstName;
	Address address = null;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String lastName;
	private String email;

}
