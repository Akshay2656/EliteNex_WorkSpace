class Account{
	private long accountNo;
	private String accountHolderName;
	private double balance;
	private String ifscCode;
	
	Account(){
	
	}
	
	Account(long accountNo, String accountHolderName, double balance, String ifscCode){
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.ifscCode = ifscCode;
	}
	
	public long getAccountNo(){
		return accountNo;
	}
	
	public void setAccountNo(long accountNo){
		this.accountNo = accountNo;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getIfscCode(){
		return ifscCode;
	}
	
	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}
	
	public void debitAmount(double amount){
		if(balance >= amount){
			this.balance = this.balance - amount;
			System.out.println("Amount debited Successfully");
		}
		else{
			System.out.println("Inufficient Balance");
		}		
	}
	
	public void creditAmount(double amount){
		if(amount <= 0){
			System.out.println("Amount must be greater than zero");
		}
		else{
			this.balance = this.balance + amount;
			System.out.println("Creadited amount Successfull");
		}
	}
	
	public static void transferAmount(Account a1, Account a2, double amountToTransfer){
		
		if (a1.getBalance() >= amountToTransfer){
			a1.balance = a1.getBalance() - amountToTransfer;
			a2.balance = a2.getBalance() + amountToTransfer;
			System.out.println("Amount Transfer successfull");
		}
		else{
			System.out.println("Transfer Failed");
		}
	
	}
		
	
}