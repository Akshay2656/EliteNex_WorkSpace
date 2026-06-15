import java.util.*;
abstract class Payment{
	double amount;
	
	Payment(double amount){
		this.amount = amount;
	}
	
	abstract void processPayment();
}


class CreditCard extends Payment{
	String cardNumber;
		
	CreditCard(double amount, String cardNumber){
		super(amount);
		this.cardNumber = cardNumber;
	}
	
	void processPayment(){
		double creditCardCharges = amount * 0.02;
		double totalBalance = amount + creditCardCharges ;
		
		System.out.println("Processing Credit Card Payment");
		System.out.println("Credit Card Number   : "+cardNumber);
		System.out.println("Amount               : "+amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount      : "+amount);
		System.out.println("Transaction charges  : " +creditCardCharges);
		System.out.println("Final Amount Debited : "+(amount + creditCardCharges));
		System.out.println("=====================================================");
	}
	
}
	
class UPI extends Payment{
	String upiId;
		
	UPI(double amount, String upiId){
		super(amount);
		this.upiId = upiId;
	}
	
	void processPayment(){
		double upiCharges = 0;
		double totalBalance = amount + upiCharges ;
		
		System.out.println("Processing UPI Payment");
		System.out.println("UPI ID               : "+upiId);
		System.out.println("Amount               : "+amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount      : "+amount);
		System.out.println("Transaction charges  : " +upiCharges);
		System.out.println("Final Amount Debited : "+(amount + upiCharges));
		System.out.println("=====================================================");
	}
	
		
}
	
class NetBanking extends Payment{
	String bankName;
	
	NetBanking(double amount, String bankName){
		super(amount);
		this.bankName = bankName;
	}
		
	void processPayment(){
		
		double netBankingCharges = amount * 0.01;
		double totalBalance = amount + netBankingCharges ;
		
		System.out.println("Processing NetBanking Payment");
		System.out.println("Bank Name            : "+bankName);
		System.out.println("Amount               : "+amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount      : "+amount);
		System.out.println("Transaction charges  : " +netBankingCharges);
		System.out.println("Final Amount Debited : "+(amount + netBankingCharges));
		System.out.println("=====================================================");
	}
		
		
}
public class PaymentGateway{
	public static void main(String[] args){
		List<Payment> payments = new ArrayList<>();
		
		payments.add(new CreditCard(5000, "123123123"));
		payments.add(new UPI(2000, "abs123"));
		payments.add(new NetBanking(3000, "HDFC BANK"));
		
		for (Payment p : payments) {
            p.processPayment();  
        }
	}
}