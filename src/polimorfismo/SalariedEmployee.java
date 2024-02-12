package polimorfismo;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee(String name,String last, String ssn, double salary) {
		super(name,last,ssn);
		
		setWeekSalary(salary);
	}

	private void setWeekSalary(double salary) {
		weeklySalary = salary < 0.0 ? 0.0 : salary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(),"weekly salary",getWeeklySalary());
	}
}
