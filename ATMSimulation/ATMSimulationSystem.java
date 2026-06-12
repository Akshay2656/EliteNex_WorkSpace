import java.util.*;

class ATMSimulationSystem{
	static double balance = 50000;
	
	public static void checkBalance(){
		System.out.println("Available Balance is: "+balance);
		
	}
	
	public static void depositMoney(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to deposit");
		double deposit = sc.nextDouble();
		
		double updatedBalance = deposit + balance;
		System.out.println("Deposite Successful");
		System.out.println("Updated Balance is: "+updatedBalance);
	}
	
	public static void withdraw(double balance){
		if (balance > 0){
			//balance = balance - amount;
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("=============================");
			System.out.println("||  ATM SIMULATION SYSTEM  ||");
			System.out.println("=============================");
			System.out.println("1. CHECK BALANCE");
			System.out.println("2. DEPOSITE MONEY");
			System.out.println("3. WITHDRAW MONEY");
			System.out.println("4. MINI STATEMENT");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					checkBalance();
					break;
					
				case 2:
					depositMoney();
					break;
				
				case 3:
					
					
					
					
					
				
			}		
		}
	}
}