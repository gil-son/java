# java - junit
## JUnit

## JUnit vs. TDD


<p>This is JUnit:</p>
  
  ```
  public class Account {
	
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	
	private Long id;
	private Double balance;
	
	public Account() {
		
	}

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}
}

```
 
  ```
  
  import entities.Account;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void depositShouldDonNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		Account acc  = new Account(1L, expectedValue);
		double amount = -200;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	
}
  ```
<p> but not TDD, because the method was created with the business rule in the class Account:</p>

```
  public void deposit(double amount) {
		if(amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}

```
<p> and then the test method with the @Test annotation with the logic of the expected value with the value to be compared: </p>

```
@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
  
  @Test
	public void depositShouldDonNothingWhenNegativeAmount() {
		double expectedValue = 100.0;
		Account acc  = new Account(1L, expectedValue);
		double amount = -200;
		acc.deposit(amount);
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}

```

<p>In TDD, the test method is created with the @Test annotation, put the expected value to compare and it triggers the functionality. After then will the programmer create the rule for business in class, such a way that it returns the expected value.</p>


## Source

<ul>
  <li><a href="https://devsuperior.com.br/">DevSuperior</a></li>
</ul>



















