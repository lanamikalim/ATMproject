import java.util.HashMap;
import java.util.Map;

public class ATM {

	static Map<String,Float> bankAccounts = new HashMap<String,Float>();

	public static void deposit(String bankID,  double depositVal) {
		float newDeposit = (float)(depositVal);

		if(bankAccounts.containsKey(bankID)) {
			float currentVal = bankAccounts.get(bankID);
			newDeposit = currentVal + (float)depositVal;
		}

		bankAccounts.put(bankID, newDeposit);
	}

	public Float getBankAccounts(String id) {
		return bankAccounts.get(id);
	}
	
	public static void withdraw(String accountID, double amount) {
		float famount = (float)(amount);
		if(bankAccounts.get(accountID) < famount) {
			System.out.println("Withdraw failed. ya broke ;( sorry !");
		}else {
			bankAccounts.put(accountID, bankAccounts.get(accountID) - famount);
			System.out.println("Withdrew " + amount + " successfully. Current balance of " + accountID + " is " + bankAccounts.get(accountID));
		}
	}
	
	public static void checkBalance(String accountID) {
		if(!bankAccounts.containsKey(accountID)) {
			System.out.println("Could not check balance. No account with that ID currently exists.");
		}else {
			System.out.println("Checking balance of " + accountID + ": " + bankAccounts.get(accountID));
		}
	}
	
	
}
