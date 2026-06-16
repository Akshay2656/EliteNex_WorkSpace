class Employee{
	int empId;
	String empName;
	double salary;
	String department;
	
	public Employee(int empId, String empName, double salary, String department){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	
	public String toString(){
		return "EmployeeId:"+empId+"\nEmployeeName :"+empName+"\nEmployeeSalary: "+salary+"\nEmployee Department: "+department;
	}
	
	public static void main(String[] args){
		Employee employee = new Employee(101, "Akshay", 60000, "Development");
		
		System.out.println(employee);
	}
}