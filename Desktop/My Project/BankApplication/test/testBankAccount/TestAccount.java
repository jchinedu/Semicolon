package testBankAccount;

import BankAccount.Account;
import org.junit.jupiter.api.Test;
import Exception.NegativeAmountException;
import Exception.InsufficientFundsException;
import Exception.InvalidPinException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {
        Account johnaccount = new Account("john", "egeonu","correctPin");

        @Test
        public void testAccount_with_zero_balance() {
            johnaccount.getBalance();
            assertEquals(johnaccount.getBalance(), 0);
        }

        @Test
        public void testAccount_can_deposit() {
            johnaccount.deposit(2000);
            assertEquals(johnaccount.getBalance(), 2000);
        }

        @Test
        public void testAccount_deposit_negative_balance_ThrowsException() {
            assertEquals(johnaccount.getBalance(), 0);

            assertThrows(NegativeAmountException.class, () -> johnaccount.deposit(-2000));
        }

        @Test
        public void testAccount_can_withdraw_balance() {
            johnaccount.deposit(2000);
            johnaccount.withdraw(1000, "correctPin");
            assertEquals(johnaccount.getBalance(), 1000);
        }

        @Test
        public void testAccount_can_withdraw_negative_balance() {
            johnaccount.deposit(2000);
            assertThrows(NegativeAmountException.class, () -> johnaccount.withdraw(-1000, "correctPin"));
        }

        @Test
        public void testAccount_can_withdraw_zero_balance() {
            johnaccount.deposit(0);
            johnaccount.withdraw(0, "correctPin");
            assertEquals(johnaccount.getBalance(), 0);
        }

        @Test
        public void testAccount_can_not_withdraw_more_than_balance_ThrowsException() {
            johnaccount.deposit(2000);
            assertEquals(2000, johnaccount.getBalance());
            assertThrows(InsufficientFundsException.class, () -> johnaccount.withdraw(3000, "correctPin"));
        }

        @Test
        public void testAccount_can_withdraw_with_correctPin() {
            johnaccount.deposit(2000);
            johnaccount.withdraw(1000, "correctPin");
            assertEquals(johnaccount.getBalance(), 1000);
        }

        @Test
        public void testAccount_can_not_withdraw_with_wrongpin_throwsException() {
            johnaccount.deposit(2000);
            assertThrows(InvalidPinException.class, () -> johnaccount.withdraw(1000,"wrongPin"));

        }
    @Test
    public void testAccount_that_Negative_Withdrawal_ThrowsException() {
        johnaccount.deposit(2000);
        assertEquals(2000, johnaccount.getBalance());
        assertThrows(NegativeAmountException.class, () -> johnaccount.withdraw(-2000, "correctPin"));
    }
    @Test
    public void testAccount_nameIsCorrect(){
            assertEquals("john egeonu",johnaccount.getName());
    }
    }


