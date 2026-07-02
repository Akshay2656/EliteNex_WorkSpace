class AccountDriver{
	public static void main(String[] args){
		Account a1 = new Account(1234454,"akshay",50000, "aab1234");
		a1.debitAmount(500);
		System.out.println("Current Balance: "+a1.getBalance());
		a1.creditAmount(1000);
		System.out.println("Current Balance: "+a1.getBalance());
		
		
		Account a2 = new Account(11111111,"amit",40000, "aab1234");
		// a2.debitAmount(500);
		// System.out.println("Current Balance: "+a2.getBalance());
		// a2.creditAmount(1000);
		// System.out.println("Current Balance: "+a2.getBalance());
		
		Account.transferAmount(a1, a2, 1000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
	}
}