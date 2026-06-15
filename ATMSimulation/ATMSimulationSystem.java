import java.util.*;

class ATMSimulationSystem{
	static double balance = 50000;
	static String lastTransactionType = "";
	static double lastTransactionAmount = 0;
	static double lastTransactionBalance = 0;
	
	public static void checkBalance(){
		System.out.println("Available Balance is: "+balance);
		
	}
	
	public static void depositMoney(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to deposit");
		double deposit = sc.nextDouble();
		
		balance = balance + deposit;
		
		lastTransactionType = "DEPOSIT";
		lastTransactionAmount = deposit;
		lastTransactionBalance = balance;
		
		System.out.println("Deposite Successful");
		System.out.println("Updated Balance is: "+balance);
	}
	
	public static void withdraw(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount to Withdraw");
		double withdrawAmount = sc.nextDouble();
		
		if (withdrawAmount <= balance){
			balance = balance - withdrawAmount;
			
			System.out.println("Withdraw Successfull");
			System.out.println("Remaining Balance: " +balance);
		}
		else{
			System.out.println("Insufficient Balance");
			System.out.println("Available Balance: "+balance);
		}
		lastTransactionType    = "WITHDRAWAL";
        lastTransactionAmount  = withdrawAmount;
        lastTransactionBalance = balance;
	}
	
	public static void miniStatement(){
		System.out.println("Mini Statement");
		
		if (lastTransactionType == null){
			System.out.println("No Transaction found");
		}
		else{
			System.out.println("Last Transaction Type : "+lastTransactionType);
			System.out.println("Last Transaction Amount : "+lastTransactionAmount);
			System.out.println("Last Transaction Balance : "+lastTransactionBalance);
			System.out.println("Avaliable Balance : "+balance);
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
			
			System.out.println("Enter Your choice");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					checkBalance();
					break;
					
				case 2:
					depositMoney();
					break;
				
				case 3:
					withdraw();
					break;
					
				case 4:
					miniStatement();
					break;
					
				case 5:
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
					
				
			}		
		}
	}
}