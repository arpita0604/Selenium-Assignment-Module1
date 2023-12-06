package salaryCalculator;

public class Boss extends employee{
	protected static double getBasicSalary()
	{
		return basicSalary;
	}
	protected static void setBasicSalary(double basicSalary)
	{
		Boss.basicSalary=basicSalary;
		
	}
	@Override
	  public double calculateTransportAllowance()
	{
		double transportAllowance = 15*basicSalary/100;
		return transportAllowance;
	}

}
