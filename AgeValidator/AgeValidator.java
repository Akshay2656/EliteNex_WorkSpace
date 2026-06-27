import java.util.*;

class AgeValidator{
	
	static void checkAge(int age) throws Exception{
		if (age < 18){
			throw new Exception("Age must be 18 or above");
		}
		System.out.println("Access Granted");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		try{
			checkAge(age);
		}catch(Exception e){
			System.out.println("Error: " +e.getMessage());
		}
	}
}