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
	
	// public void setId(int empId){
		// this.empId = empId;
	// }
	
	// public int getId(){
		// return empId;
	// }
	
	// public void setName(String empName){
		// this.empName = empName;
	// }
	
	// public String getName(){
		// return empName;
	// }
	
	// public void setSalary(double salary){
		// this.salary = salary;
	// }

	// public double getSalary(){
		// return salary;
	// }	
	
	// public void setDepartment(String department){
		// this.department = department;
	// }
	
	// public String getDepartment(){
		// return department;
	// }
	
	public String toString(){
		return "EmployeeId:"+empId+"\nEmployeeName :"+empName+"\nEmployeeSalary: "+salary+"\nEmployee Department: "+department;
	}
	
	public static void main(String[] args){
		Employee employee = new Employee(101, "Akshay", 60000, "Development");
		
		System.out.println(employee);
	}
}