import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		UserRegistration register = new UserRegistration();
		
		System.out.println("Enter User Name: ");
		String userName = sc.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		register.registerUser(userName, age, password);
	}
}