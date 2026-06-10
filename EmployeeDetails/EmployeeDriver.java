class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	private String department;
	
	Employee(int empId, String empName, double empSalary, String department)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}
	
	public void setId(int empId){
		this.empId = empId;
	}
	
	public int getId(){
		return empId;
	}
	
	public void setName(String empName){
		this.empName = empName;
	}
	
	public String getName(){
		return empName;
	}
	
	public void setSalary(double empSalary){
		this.empSalary = empSalary;
	}
	
	public double getSalary(){
		return empSalary;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void display(){
		System.out.println("Employee ID: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee ID: "+getSalary());
		System.out.println("Employee ID: "+getDepartment());
		
		System.out.println("============================");
		
	}
	
}


public class EmployeeDriver{
	public static void main(String[] args){
		Employee emp = new Employee(1, "ABC", 123123, "Development");
		Employee emp2 = new Employee(2, "PQR", 123123, "Development");
		emp.display();
		emp2.display();
		System.out.println(emp);
		
	}

}