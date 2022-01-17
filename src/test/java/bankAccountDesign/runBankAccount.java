package bankAccountDesign;

public class runBankAccount {

	public static void main(String[] args) {


		bankAccount Mike = new bankAccount();
		
		bankAccount Jon = new bankAccount();
		
		checkingAccount alec = new checkingAccount("Sadaf");
		
		savingAccount jim = new savingAccount();
		
		
		alec.amountOfMoney = 34;
		
		Mike.City= "FairfaxCity";
		Jon.amountOfMoney = 124;
		Mike.amountOfMoney= 65700;
		
		System.out.println(Mike.amountOfMoney);
		
		System.out.println(Jon.amountOfMoney);
		
		System.out.println(Mike.City);
		
		System.out.println(Jon.City);
		
		bankAccount.numberOfCustomers = 345897;
		System.out.println(bankAccount.numberOfCustomers);
		
		
		
		
		
		

	}

}
