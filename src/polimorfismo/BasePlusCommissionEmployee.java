package polimorfismo;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first ,String last, String ssn, double sales, double rate, double salary ) {
		super(first,last,ssn,sales,rate);
		
		setBaseSalary(salary);
	}
	
	private void setBaseSalary(double  salary) {
		baseSalary = (salary > 0.0 ) ? salary : 0.0;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getBaseSalary() * super.earnings();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s\n%s: %.2f", "base-salaried",
				super.toString(),"base salary", getBaseSalary());
	}
}
