import java.util.*;

class AtmWithdrawal{
	
	static double withdrowAmount(double balance , double amount) throws Exception{
		if (amount <= 0){
			throw new Exception ("Amount must be greater than zero");
		}
		
		if (amount > balance) {
			throw new Exception("Insufficient balance");
		}
		
		return balance - amount;
	}
	public static void main(String[] args){
		double balance = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Balance: "+balance);
		System.out.println("Enter Amount to withdrow: ");
		double amount = sc.nextDouble();
		
		try{
			balance = withdrowAmount(balance, amount);
			System.out.println("Withdrow Successfull");
			System.out.println("Updated Balance: "+balance);
		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
			System.out.println("Available Balance: "+balance);
		}
	}
}