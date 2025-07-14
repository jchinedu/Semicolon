package testSvaingsAccount;

import SavingAccount.SavingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSavingsAccount {
    SavingAccount mySavingAccount = new SavingAccount(2000);
    SavingAccount mySavingAccount2 = new SavingAccount(3000);
    @Test
    public void testthatthemonthlyInterestRateCalculatesWell(){
       mySavingAccount.getSavingBalance();
       mySavingAccount2.getSavingBalance();
       mySavingAccount.ModifyMonthlyInterest(0.04);
       mySavingAccount2.ModifyMonthlyInterest(0.04);
       mySavingAccount.CalculateMonthlyInterest();
       mySavingAccount2.CalculateMonthlyInterest();
       assertEquals(2006.6666666666667, mySavingAccount.getSavingBalance());
       assertEquals(3010, mySavingAccount2.getSavingBalance());
    }
}
