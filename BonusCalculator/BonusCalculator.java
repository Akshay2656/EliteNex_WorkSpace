import java.util.*;
class BonusCalculator{
	
	static void printData(String empName, double salary, char empRating, double calculateBonus){
		System.out.println("Employee Name    : "+empName);
		System.out.println("Salary           : "+salary);
		System.out.println("Employee Rating  : "+empRating);
		System.out.println("Bonus Amount     : "+calculateBonus);
		System.out.println("Final Salary     : "+(salary + calculateBonus));
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		
		if(empName.isEmpty()){
			System.out.println("Error: Employee Name cannot be empty");
			return;
		}
		
		System.out.println("Enter Employee Salary");
		double salary = sc.nextDouble();
		
		if(salary <= 0){
			System.out.println("Error: Salary Must be greater than Zero");
			return;
		}
		
		System.out.println("Enter Performance Rating: A , B , C , D");
		char empRating = sc.next().toUpperCase().charAt(0);
		
		double calculateBonus;
		
		switch(empRating){
			case 'A': 
					calculateBonus = salary * 0.20;
					break;
			
			case 'B': 
					calculateBonus = salary * 0.15;
					break;
					
			case 'C': 
					calculateBonus = salary * 0.10;
					break;
					
			case 'D': 
					calculateBonus = salary * 0.05;
					break;		
					
			default:
					System.err.println("Invalid Choice. Please Try Again!!!!");
					return;
		}
		
		printData(empName, salary, empRating, calculateBonus);
		
		
	}

}

