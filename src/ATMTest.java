
public class ATMTest {

	public ATMTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		atm.deposit("Lana Lim", 100);
		atm.deposit("Peter Parker", 20);
		atm.deposit("Lana Lim", 50);
		
		System.out.println("Current balance of Lana is " + atm.getBankAccounts("Lana Lim"));
		
		//TESTING NEGATIVE DEPOSIT
		atm.deposit("Lana Lim", -30);
		System.out.println("Current balance of Lana is " + atm.getBankAccounts("Lana Lim"));
	}

}
