package ex01;

import java.util.Scanner;

public class CheckingAccount {
	private int id;
    private float balance;
    private float overdraft;
    
	public CheckingAccount(int id, float balance, float overdraft) {
		this.id = id;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	
	Scanner input = new Scanner(System.in);
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public float getBalance() {return balance;}
	public void setBalance(float balance) {this.balance = balance;}
	
    public float getOverdraft() {return overdraft;}
	public void setOverdraft(float overdraft) {this.overdraft = overdraft;}

	public void deposit(float value) {
    	this.setBalance(value+this.getBalance());
    }

	public void withDraw(float value) {
    	if(this.getBalance() >= value) {
    		this.setBalance(this.getBalance() - value);
    		System.out.printf("\n\nThe withdrawal is done!");
    	}else {
    		System.out.printf("\n\nWarning! You don't have enough balance");
    		if(this.getBalance()+this.getOverdraft() - value >= 0) {
    			System.out.println("\nWould you like use the Overdraft s/n?");
    			char verify = input.next().charAt(0);
        		try {
        			if(verify == 's') {
            			float aux = this.getBalance()+this.getOverdraft();
        				this.setBalance(0);
        				this.setOverdraft(aux-value);
        				System.out.printf("\n\nThe withdrawal is done!");
            		}else {
            			System.out.printf("\n\nOffer declined! The operation was canceled!");
            		}
        		}catch(Exception e) {
        			System.out.printf("%s",e.getMessage());
        			System.out.printf("\n\nThe operation was canceled!");
        		}
    			
    		}else {
    			System.out.printf("\n\nYou don't have enough balance! The operation was canceled!");
    		}
    	}
    }
    
    public void status() {
    	System.out.printf("\n\n\t Cheking Account Status\n id: %d\n balance: %f",this.getId(),this.getBalance());
    }
    
}
