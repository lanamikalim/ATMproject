import java.util.HashMap;
import java.util.Map;

public class ATM {

	Map<String,Float> bankAccounts = new HashMap<String,Float>();

	public void deposit(String bankID,  float depositVal) {
		float newDeposit = depositVal;

		if(bankAccounts.containsKey(bankID)) {
			float currentVal = bankAccounts.get(bankID);
			newDeposit = currentVal + depositVal;
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
	
	
}
