import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		try {
			
			System.out.print("Provide Account Number : ");
			String accountNum=input.nextLine();
			System.out.print("Enter the amount to withdraw :R");
			BigDecimal amount=input.nextBigDecimal();
			SavingsAccount savingsAccount=new SavingsAccount();
			
			withdraw(accountNum,amount);
			
		}catch(Exception e) {
			System.out.println("\nYou can not withdraw that amount, try a whole  number!");
		}
	}	

	public static void withdraw(String accountNum,BigDecimal amountToWithdraw) {
		
		Scanner key=new Scanner(System.in);
		SavingsAccount savingsAccount=new SavingsAccount();
		CurrentAccount currentAccount=new CurrentAccount();
		
		BigDecimal currentAccUser3Balance=currentAccount.getUser3Balance().add(currentAccount.getUser3Overdrsft());//adding the overdraft and current balance in the Current Account
		BigDecimal currentAccUser4Balance=currentAccount.getUser4Balance().add(currentAccount.getUser4Overdrsft());//
		
		BigDecimal newBalance;
		BigDecimal minimumBalance=new BigDecimal("1000");
	
			if(accountNum.equals(savingsAccount.getUser1AccountNum())) {//checks if the account is for this user
				if(amountToWithdraw.compareTo(savingsAccount.getUser1Balance())>=1) {//checking if the amount requested is not more than the balance in the account
					System.out.print("Insufficient funds...");
				}else {//if the balance is greater than the amount withdrawn, this code is executed
					newBalance=(savingsAccount.getUser1Balance()).subtract(amountToWithdraw);
					if(newBalance.compareTo(minimumBalance)>=1) {		//checking if balance will be 1000 or more after withdrawal.
						//if balance is 1000 or more after withdrawal withdrawal is approved .
						System.out.println("\nSuccessful!");
						System.out.println("Balance: R"+newBalance);
						
					}else {		//if balance is not 1000 or more after withdrawal withdrawal declines. 
						System.out.println("\nDeclined! Balance in this account can not be less than R1000");
					}
					
					
					//updating Database with a new balance.
					
					savingsAccount.setUser1Balance(newBalance);//checks if the account is for this user
				}
			}else if(accountNum.equals(savingsAccount.getUser2AccountNum())) {//checks if the account is for this user
				if(amountToWithdraw.compareTo(savingsAccount.getUser2Balance())>=1) {//checking if the amount requested is not more than the balance in the account
					System.out.print("Insufficient funds...");
				}else {
					newBalance=(savingsAccount.getUser2Balance()).subtract(amountToWithdraw);
					if(newBalance.compareTo(minimumBalance)>=1) {		//checking if balance will be 1000 or more after withdrawal.
						//if balance is 1000 or more after withdrawal withdrawal is approved .
						
						System.out.println("\nSuccessful!");
						System.out.println("Balance: R"+newBalance);
					}else {		//if balance is not 1000 or more after withdrawal withdrawal declines. 
						System.out.println("\nDeclined! Balance in this account can not be less than R1000");
					}
	
					//updating Database with a new balance.
					
					savingsAccount.setUser2Balance(newBalance);
				}
			}else if(accountNum.equals(currentAccount.getUser3AccountNum())) {//checks if the account is for this user
				if(amountToWithdraw.compareTo(currentAccUser3Balance)>=1) {//checking if the amount requested is not more than the balance in the account
					System.out.print("Insufficient funds...");
				}else {
					System.out.println("\nSuccessful!");
					newBalance=(currentAccUser3Balance).subtract(amountToWithdraw);
					System.out.println("Balance: R"+newBalance);
					
					//updating Database with a new balance.
					
					currentAccount.setUser3Balance(newBalance);
				}
			}else if(accountNum.equals(currentAccount.getUser4AccountNum())) {//checks if the account is for this user
				if(amountToWithdraw.compareTo(currentAccUser3Balance)>=1) {//checking if the amount requested is not more than the balance in the account
					System.out.print("Insufficient funds...");
				}else {
					System.out.println("\nSuccessful!");
					newBalance=(currentAccUser4Balance).subtract(amountToWithdraw);
					System.out.println("Balance: R"+newBalance);
					
					//updating Database with a new balance.
					
					currentAccount.setUser4Balance(newBalance);
					
				}
			}else {//executes when you entered an incorrect account number
				System.out.print("\nAccount number does not exist...");
			}
			
		}

}
