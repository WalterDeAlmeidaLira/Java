package polimorfismo;

public abstract class Employee {
	private String firstName,lastName,SocialSecurityNumber;
	
	public Employee(String name, String last, String ssn) {
		firstName = name;
		lastName = last;
		SocialSecurityNumber = ssn;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}
	
	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	public abstract double earnings();
}
