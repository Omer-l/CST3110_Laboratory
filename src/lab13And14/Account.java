//package lab13_and_14;
//
//import com.google.java.contract.Ensures;
//import com.google.java.contract.PreconditionError;
//import com.google.java.contract.Requires;
//
//public class Account {
//	private int balance;
//
//	// must return balance
//	@Ensures("result == balance")
//	public int getBalance() {
//		// write code here
//		return balance;
//	}
//
//	// constructor must not accept negative initial balances
//	// it must also store the initial balance
//	@Requires("initialBalance >= 0")
//	@Ensures("balance == initialBalance")
//	public Account(int initialBalance) {
//		// write code here
//		balance = initialBalance;
//	}
//
//	// deposit must only accept positive, non-zero amounts
//	// it must update balance to the correct value
//	@Requires("amount > 0") //result, old, condition operators too
//	@Ensures("balance == amount + old(balance)")
//	public void deposit(int amount) {
//		// write code here
//		balance += amount;
//	}
//
//
//	// withdraw must only accept positive, non-zero amounts
//	// it must only accept amounts that do not lead to negative balances
//	// it must update balance to the correct value
//	@Requires("amount > 0 && (balance - amount) >= 0")
//	@Ensures("balance == old(balance) - amount")
//	public void withdraw(int amount) {
//		// write code here
//		this.balance -= amount;
//	}
//
//	// transfer must only accept positive, non-zero amounts
//	// it must only accept inputs that do not lead to negative balances
//	// it must update the balances of both accounts to the correct values
//	@Requires("amount > 0 && (from.balance - amount) >= 0 ")
//	@Ensures("(from.getBalance() == (old(from.getBalance()) - amount)) && (to.getBalance() == (old(to.getBalance()) + amount))")
//	public static void transfer(Account from, Account to, int amount) {
//		// write code here using withdraw and deposit
//		from.withdraw(amount);
//		to.deposit(amount);
//	}
//}
