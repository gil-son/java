package ex01;

import java.util.ArrayList;

public class Bank {
		private int code = 0;
		private Client c;
	    public ArrayList<SavingAccount> sa = new ArrayList<SavingAccount>(); // public for test 
	    private ArrayList<CheckingAccount> ca = new ArrayList<CheckingAccount>();
	    
	    private static int numSA=0;
	    private static int numCA=0; 
	       
	    public ArrayList<CheckingAccount> getCa() {return ca;}
		public void setCa(ArrayList<CheckingAccount> ca) {this.ca = ca;}
		
		public int getCode() {return code;}
		public void setCode(int code) {this.code = code;}
		
		public Client getC() {return c;}
		public void setC(Client c) {this.c = c;}
		
		public static int getNumSA() {return numSA;	}
		public static void setNumSA(int numSA) {Bank.numSA = numSA;	}
		
		public static int getNumCA() {return numCA;}
		public static void setNumCA(int numCA) {Bank.numCA = numCA;}

		public void startBank() {
			setCode(getCode()+1);
			Client c = new Client(getCode());
			
	    	SavingAccount sa = new SavingAccount(c.getId(),50);
	    	CheckingAccount ca = new CheckingAccount(c.getId(),100,10);
	    	
	    	setNumSA(getNumSA()+1); 
	    	setNumCA(getNumCA()+1); 
	    	
	    	this.sa.add(sa);
	    	this.ca.add(ca);
	    }
	    
	    public void startSanvingAccount() {
	    	sa.add(new SavingAccount(this.c.getId(),50));
	    	setNumSA(getNumSA()+1);
	    }
	    
	    public void startCheckingAccount() {
	    	ca.add(new CheckingAccount(this.c.getId(),100,10));
	    	setNumCA(getNumCA()+1); 
	    }
	    
	    public void allAccounts() {
	    	System.out.printf("\n\n\t All Accounts\n SA: %d \n CA: %d",sa.size(), this.numCA);
	    	
	    }
}
