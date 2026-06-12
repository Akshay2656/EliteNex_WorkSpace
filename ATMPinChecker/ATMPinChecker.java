import java.util.*;

class ATMPinChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int atmPin = 1234;
		int remainingAttempt = 3;
		
		// while(true){
			// System.out.println("Enter your PIN number");
			// int pin = sc.nextInt();
	
			// for (int i = 1 ; i <= remainingAttempt ; i++){
			
				// if (pin == atmPin){
					// System.out.println("Login Successful");
					// System.exit(0);
					// break;
				// }				
				// else{
					// System.out.println("Invalid PIN");
					// remainingAttempt--;
					// System.out.println("Remainaing Attempt: "+remainingAttempt);
					
					// if(remainingAttempt == 0) {
						// System.out.println("Card Blocked. Please contact the bank");
						// System.exit(0);
				    // }
					// break;
				// }
			// }
		// }
		
		while(remainingAttempt > 0){
			System.out.println("Enter ATM PIN: ");
			int pin = sc.nextInt();
			
			if (pin == atmPin){
				System.out.println("Login Successfull");
				break;
			}
			else{
				remainingAttempt--;
				
				if (remainingAttempt > 0){
					System.out.println("Invalid PIN");
					System.out.println("Remainaing Attempt: "+remainingAttempt);
				}
				else{
					System.out.println("Card Blocked. Please contact the bank");
				}
			}
		}
		
	}
}