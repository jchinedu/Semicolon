package BankAccount;

import java.util.ArrayList;

public class MyBank {
    private ArrayList<Account> johnaccounts = new ArrayList<>();

    public Account createAccount(String firstName, String LastName, String correctpin) {
       Account johnaccount = new  Account(firstName, LastName, correctpin);
       johnaccounts.add(johnaccount);
       return johnaccount;
    }
    public String getCorrectPin(int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.getCorrectPin();
    }
    private Account findAccountByAccountNumber(int accountNumber) {
        return johnaccounts.get(accountNumber -1);
    }

    public int getBalance(int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.getBalance();
    }

    public void deposit(int accountNumber, int amount) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.deposit(amount);
    }

    public void Withdraw(int amount, String pin,int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.withdraw(amount,pin);
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, int amount, String pin) {
        Account fromAccount = findAccountByAccountNumber(fromAccountNumber);
        Account toAccount = findAccountByAccountNumber(toAccountNumber);

        fromAccount.withdraw(amount,pin);
        toAccount.deposit(amount);
    }
}
