
import BankAccount.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class TestAccount {
        Account johnaccount = new Account("correctPin");

        @Test
        public void testAccount_with_zero_balance() {
            this.johnaccount.getBalance();
            Assertions.assertEquals(this.johnaccount.getBalance(), 0);
        }

        @Test
        public void testAccount_can_deposit() {
            this.johnaccount.deposit(2000);
            Assertions.assertEquals(this.johnaccount.getBalance(), 2000);
        }

        @Test
        public void testAccount_cannot_deposit_negative_balance() {
            this.johnaccount.deposit(-2000);
            Assertions.assertEquals(this.johnaccount.getBalance(), 0);
        }

        @Test
        public void testAccount_can_withdraw_balance() {
            this.johnaccount.deposit(2000);
            this.johnaccount.withdraw(1000, "correctPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 1000);
        }

        @Test
        public void testAccount_can_withdraw_negative_balance() {
            this.johnaccount.deposit(2000);
            this.johnaccount.withdraw(-1000, "correctPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 2000);
        }

        @Test
        public void testAccount_can_withdraw_zero_balance() {
            this.johnaccount.deposit(0);
            this.johnaccount.withdraw(0, "correctPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 0);
        }

        @Test
        public void testAccount_can_not_withdraw_more_than_balance() {
            this.johnaccount.deposit(2000);
            this.johnaccount.withdraw(3000, "correctPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 2000);
        }

        @Test
        public void testAccount_can_withdraw_with_correctPin() {
            this.johnaccount.deposit(2000);
            this.johnaccount.withdraw(1000, "correctPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 1000);
        }

        @Test
        public void testAccount_can_not_withdraw_with_wrongpin() {
            this.johnaccount.deposit(2000);
            this.johnaccount.withdraw(1000, "wrongPin");
            Assertions.assertEquals(this.johnaccount.getBalance(), 2000);
        }
    }


