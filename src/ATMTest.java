
public class ATMTest {

	public ATMTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ATM atm = new ATM();
//		atm.deposit("Winfrey", 100);
//		atm.deposit("Bezos", 20);
//		atm.deposit("Lana Lim", 50);
//		
//		System.out.println("Current balance of Lana is " + atm.getBankAccounts("Lana Lim"));
//		
//		//TESTING NEGATIVE DEPOSIT
//		atm.deposit("Lana Lim", -30);
//		System.out.println("Current balance of Lana is " + atm.getBankAccounts("Lana Lim"));
//		
//		
//		System.out.println(atm.withdraw("Winfrey", 25159684372.43));
//		System.out.println(atm.withdraw("Bezos", 193495330293.43));
//		System.out.println(atm.withdraw("Bezos", 20394353.35));
		
		
		ATM.deposit("Winfrey", 25159684372.43);
		ATM.deposit("Bezos", 193495330293.43);
		ATM.deposit("Bezos", 20394353.35);
		ATM.withdraw("Bezos", 3593293.66);
		ATM.deposit("MrTheiss",64033.55);
		ATM.withdraw("MrTheiss", 443964.46);
		ATM.checkBalance("Bezos");
		ATM.checkBalance("Winfrey");
		ATM.checkBalance("YoMama");
		ATM.checkBalance("MrTheiss");
	}

}
