package polimorfismo;

public class PolymorphismTest {
	public static void main(String[] args) {
		CommissionEmployee ce = new CommissionEmployee("Sue", "jones","2222-2222", 10000, .06);
		
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Bob", "Lewis",
				"3333-3333", 5000, .04, 300);
		
		System.out.println(ce);
		
		System.out.println(bpce);
		
		CommissionEmployee ce2 = bpce;
		
		System.out.println(ce2);
	}
}
