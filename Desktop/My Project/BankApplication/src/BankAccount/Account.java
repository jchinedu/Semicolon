package BankAccount;
import Exception.*;
import Exception.NegativeAmountException;
public class Account {
        private String correctPin;
        int balance;
    private String name;

    public Account(String Firstname, String Lastname,String correctPin) {
        this.correctPin = correctPin;
        this.name = Firstname + " " + Lastname;
        }
        public String getCorrectPin() {
        return correctPin;
        }
        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            ValidateNegativeAmount(amount);
                balance += amount;
        }

        public void withdraw(int amount, String pin) {
            Validate(amount, pin);
            balance -= amount;
        }

    private void Validate(int amount, String pin) {
        isAmountValid(amount);
        ValidateNegativeAmount(amount);
        ValidatePin(pin);
    }

    private void ValidatePin(String pin) {
        boolean pinIsInvalid = pin.equals(correctPin);
        if(!pinIsInvalid) {
            throw new InvalidPinException();
        }
    }

    private static void ValidateNegativeAmount(int amount) {
        boolean isAmountNegative = amount < 0;
        if(isAmountNegative) {
            throw new NegativeAmountException();
        }
    }

    private void isAmountValid(int amount) {
            boolean amountExceedsBalance = amount > balance;
            if(amountExceedsBalance) {
                throw new InsufficientFundsException();
            }
        }

    public String getName() {
            return name;
    }
}


