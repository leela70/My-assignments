package week1.day3;



public class EmployeeDetails {
	public void getEmployeeName(String EmployeeName)
	{
		System.out.println("EmployeeName  "+EmployeeName);
	}
		
		public void getEmployeeAge(int EmployeeAge)
		{
			System.out.println("Employeeage  "+EmployeeAge);
		}
		public static void main(String[] args) {

		EmployeeDetails details=new EmployeeDetails();
		details.getEmployeeName("leela");
		details.getEmployeeAge(35);
		details.getEmployeeName("arthi");
		details.getEmployeeAge(25);
	}
}


