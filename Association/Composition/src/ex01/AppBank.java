package ex01;

public class AppBank {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.startBank();
		bank.startBank();
		
		bank.sa.get(1).deposit(500);
		bank.sa.get(1).status();
		
		bank.getCa().get(1).deposit(500);
		bank.getCa().get(1).status();
		
		bank.getCa().get(1).withDraw(610);
		bank.getCa().get(1).status();
		
		
		bank.sa.get(0).withDraw(51); 
		
		bank.allAccounts();
	}

}
