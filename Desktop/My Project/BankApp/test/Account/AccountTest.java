package Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account1 myAccount;
    @BeforeEach
    public void setUp(){
        myAccount = new Account1();
    }
    @Test
    public void TestAccountBalanceis_zero(){
        assertEquals(0,myAccount.getBalance());
    }
    @Test
    public void TestAccountDeposit(){

    }
}
