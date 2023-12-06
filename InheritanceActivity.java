package salaryCalculator;

public class InheritanceActivity {

	static Boss boss = new Boss();
	static Trainee trainee = new Trainee();
	
	
	
	public static void main(String[] args)
	{
		testCase1();
		System.out.println(boss.calculateTransportAllowance()); //boss transport allowance
		
		testCase2();
		System.out.println(trainee.calculateTransportAllowance());  //trainee transport allowance
		

	}





	protected static void testCase1()
	{
		boss.setEmployeeId(123456);
		boss.setEmployeeName("Vijay");
		boss.setEmployeeAddress("MUMBAI");
		boss.setEmployeePhone(224567);
		boss.setBasicSalary(7500);
		boss.calculateSalary();
		
	}
    
	protected static void testCase2()
	{
		trainee.setEmployeeId(122345);
		trainee.setEmployeeName("Ankit");
		trainee.setEmployeeAddress("BANGALORE");
		trainee.setEmployeePhone(234566);
		trainee.setBasicSalary(4500);
		trainee.calculateSalary();
	}


	

}
