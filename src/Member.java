
public class Member {
	private String FirstName,LastName,Address,City,State,Country,Zip,phone,UserLoginId,Password,PartyId;
	
	
	
	

	public Member() {
		super();
	}



	public Member(String firstName, String lastName, String address, String city, String state, String country,
			String zip, String phone, String userLoginId, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		City = city;
		State = state;
		Country = country;
		Zip = zip;
		this.phone = phone;
		UserLoginId = userLoginId;
		Password = password;
		
	}

	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserLoginId() {
		return UserLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		UserLoginId = userLoginId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	

}
