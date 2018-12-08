package app;

public class User {
	private String UUID, email, firstName, lastName, driversLicense;

	public User(String UUID, String email, String firstName, String lastName, String driversLicense) {
		this.UUID = UUID;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.driversLicense = driversLicense;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getDriversLicense() {
		return driversLicense;
	}

	public void setDriversLicense(String driversLicense) {
		this.driversLicense = driversLicense;
	}
}