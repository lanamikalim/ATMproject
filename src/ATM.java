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
	
	
}
