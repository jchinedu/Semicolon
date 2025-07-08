package testBankAccount;

import BankAccount.Account;
import BankAccount.MyBank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    MyBank bank;
    Account johnaccount;
    @BeforeEach
    public void setUp(){
        bank = new MyBank();
        johnaccount = bank.createAccount("john","egeonu","1234");

    }
    @Test
    public void testBankCanCreateAccount(){
        assertEquals("1234",bank.getCorrectPin(1));
    }
    @Test
    public void testBankCanCheckBalance(){
        assertEquals(0, bank.getBalance(1));
    }
    @Test
    public void testBalanceIs2k_whenDepositis2k(){
        assertEquals(0,bank.getBalance(1));
        bank.deposit(1,2_000);
        assertEquals(2_000,bank.getBalance(1));
    }
    @Test
    public void testBalanceIs3k_WhenBankWithdraws2kFrom5kBalance(){
        assertEquals(0,bank.getBalance(1));
        bank.deposit(1,5_000);
        assertEquals(5_000,bank.getBalance(1));

        bank.Withdraw(2_000, "1234",1);
        assertEquals(3_000,bank.getBalance(1));
    }
    @Test
    public void testBankCanTransfer_betweenAccounts(){
        Account mmarokAccount = bank.createAccount("mmarok","egeonu","3333");
        Account jamesAccount = bank.createAccount("james","tauri","4444");

        bank.deposit(2,2_000_000_000);
        assertEquals(2_000_000_000,bank.getBalance(2));
        assertEquals(0,bank.getBalance(3));
        bank.transfer(2,3,100_000_000,"3333");

        assertEquals(100_000_000,bank.getBalance(3));
        assertEquals(1_900_000_000,bank.getBalance(2));
    }
}
