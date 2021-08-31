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
	
	public String withdraw(String accountID, double amount) {
		float famount = (float)(amount);
		if(bankAccounts.get(accountID) < famount) {
			return "ya broke ;( sorry !";
		}else {
			bankAccounts.put(accountID, bankAccounts.get(accountID) - famount);
			return "Withdrew " + amount + " successfully. Current balance of " + accountID + " is " + bankAccounts.get(accountID);
		}
	}
	
	public String checkBalance(String accountID) {
		if(!bankAccounts.containsKey(accountID)) {
			return "No account with that ID currently exists.";
		}
		return "" + bankAccounts.get(accountID);
	}
	
	
}
