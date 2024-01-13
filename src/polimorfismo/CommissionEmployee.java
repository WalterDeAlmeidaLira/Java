package polimorfismo;

import java.net.SocketImplFactory;

public class CommissionEmployee {
	private String firstName,lastName,socialSecurity;
	private double grossSales, commissionRate;
	
	public CommissionEmployee(String name, String lastName, String ssn,double sales,double rate) {
		firstName = name;
		this.lastName = lastName;
		socialSecurity = ssn;
		grossSales = sales;
		commissionRate = rate;
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

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate > 0.0 && commissionRate <= 1.0) ? commissionRate : 0.0;
	}
	
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "commmission employee",
				getFirstName(),getLastName(),"social security number",getSocialSecurity(),
				"gross sales", getGrossSales(),"commission rate", getCommissionRate());
	}
}
