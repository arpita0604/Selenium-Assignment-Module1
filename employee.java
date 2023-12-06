package salaryCalculator;

public class employee {

	static long employeeId;
	static String employeeName;
	static String employeeAddress;
	static long employeePhone;
	static double basicSalary;
	static double specialAllowance=250.80;
	static double HRA= 1000.50;
	
	
	protected static long getEmployeeId()
	{
		return employeeId;
	}
	protected static void setEmployeeId(long Id)
	{
		employee.employeeId=Id;
	}
	
	
	protected static String getEmployeeName()
	{
		return employeeName;
	}
	protected static void setEmployeeName(String Name)
	{
		employee.employeeName=Name;
		
	}
	
	
	protected static String getEmployeeAddress()
	{
		return employeeAddress;
	}
    protected static void setEmployeeAddress(String Address)
    {
    	employee.employeeAddress=Address;
    }
    
    protected static long getEmployeePhone()
    {
    	return employeePhone;
    }
    protected static void setEmployeePhone(long Phone)
    {
    	employee.employeePhone=Phone;
    }
    
    public static void calculateSalary()
    {
    	double Salary = basicSalary + (basicSalary *specialAllowance/100) + (basicSalary*HRA/100);
    	System.out.println(Salary);
    }
    
    public double calculateTransportAllowance()
    {
    	double transportAllowance = 10/100*basicSalary;
    	return transportAllowance;
    }
	}


