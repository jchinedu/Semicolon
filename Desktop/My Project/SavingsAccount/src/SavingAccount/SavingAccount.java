package SavingAccount;

public class SavingAccount {
    private double SavingBalance;
    private double AnnualInterestRate;

    public SavingAccount(double initialBalance) {
        SavingBalance = initialBalance;
    }
    public void CalculateMonthlyInterest() {
        double MonthlyInterestRate = (SavingBalance * AnnualInterestRate) / 12;
        SavingBalance += MonthlyInterestRate;
    }
    public void ModifyMonthlyInterest(double NewRate) {
        AnnualInterestRate = NewRate;
    }
    public double getSavingBalance() {
        return SavingBalance;
    }

}
