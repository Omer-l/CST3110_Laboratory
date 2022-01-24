//package lab13_and_14;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import com.google.java.contract.PreconditionError;
//
//public class AccountTest {
//	@Test
//	public void testAccountBad() {
//		assertThrows(PreconditionError.class, () -> {
//			new Account(-1);
//		});
//	}
//
//	@Test
//	public void testAccountGood() {
//		Account account = new Account(10);
//		int balance = account.getBalance();
//		int expected = 10;
//		assertEquals(balance, expected);
//	}
//
//	@Test
//	public void testDepositBad() {
//		assertThrows(PreconditionError.class, () -> {
//			Account a = new Account(10);
//			a.deposit(-10);
//		});
//	}
//
//	@Test
//	public void testDepositGood() {
//		Account a = new Account(10);
//		a.deposit(10);
//		assertEquals(a.getBalance(), 20);
//	}
//
//	@Test
//	public void testWithdrawBad1() {
//		assertThrows(PreconditionError.class, () -> {
//			Account a = new Account(10);
//			a.withdraw(-10);
//		});
//	}
//
//	@Test
//	public void testWithdrawBad2() {
//		assertThrows(PreconditionError.class, () -> {
//			Account a = new Account(10);
//			a.withdraw(20);
//		});
//	}
//
//	@Test
//	public void testTransferGood() {
//		Account a = new Account(10);
//		Account b = new Account(0);
//		Account.transfer(a, b, 5);
//		assertEquals(a.getBalance(), 5);
//		assertEquals(b.getBalance(), 5);
//	}
//
//	@Test
//	public void testTransferBad1() {
//		assertThrows(PreconditionError.class, () -> {
//			Account a = new Account(10);
//			Account b = new Account(0);
//			Account.transfer(a, b, 15);
//		});
//	}
//
//	@Test
//	public void testTransferBad2() {
//		assertThrows(PreconditionError.class, () -> {
//			Account a = new Account(10);
//			Account b = new Account(0);
//			Account.transfer(a, b, -15);
//		});
//	}
//}
