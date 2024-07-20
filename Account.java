import java.io.*;
abstract class Account{
	abstract int calculateInterest();
}
class SavingsAccount extends Account{
	int balance;
	int interestRate;
	SavingsAccount(int balance,int interestRate){
		this.balance = balance;
		this.interestRate=interestRate;
	}
	int calculateInterest(){
		int interest;
		interest = (balance*interestRate)/100;
		return interest;
		
		

	}
}
class CurrentAccount extends Account{
	int balance1;
	int overdraftLimit;
	CurrentAccount(int balance1,int overdraftLimit){
		this.balance1 =balance1;
		this.overdraftLimit = overdraftLimit;
	}
	int calculateInterest(){
		return 0;
		
	}
}
class FixedDepositeAccount extends Account{
	int principalAmount;
	int tenure;
	int annualInterstRate;
	FixedDepositeAccount(int principalAmount,int tenure,int annualInterstRate){
		this.principalAmount = principalAmount;
		this.tenure = tenure;
	}
	int calculateInterest(){
		return (int)(principalAmount * (1 + (annualInterstRate / 100.0), tenure) - principalAmount);
		
	}
	
}
class Client{
	public static void main(String[]args)throws IOException{
		BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter balance:");
		int balance;
		balance =Integer.parseInt(br.readLine());
		System.out.println("Enter interest rate:");
		int interestRate;
		interestRate = Integer.parseInt(br.readLine());
		SavingsAccount savings = new SavingsAccount(balance, interestRate);
		System.out.println("Savings Account Interest: " + savings.calculateInterest());
		
		System.out.println("Enter principal amount");
		int principalAmount = Integer.parseInt(br.readLine());
		System.out.println("Enter  tenure: ");
		int tenure =Integer.parseInt(br.readLine());
		System.out.println("Enter annual Interst Rate:");
		int annualInterstRate= Integer.parseInt(br.readLine());
		int balance1=0;
		int overdraftLimit=0;
		FixedDepositeAccount fixed = new FixedDepositeAccount( principalAmount, tenure,annualInterstRate);
		System.out.println("Fixed Deposite Account Interest: " + fixed.calculateInterest());
		
		CurrentAccount current = new CurrentAccount(balance1, overdraftLimit);

	

        	System.out.println("Current Account Interest: " + current.calculateInterest());


		
		
		
		
	}
}
