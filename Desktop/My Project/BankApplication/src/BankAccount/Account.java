package BankAccount;
public class Account {
        private String correctPin;
        int balance;

        public Account(String correctPin) {
            this.correctPin = correctPin;
        }

        public int getBalance() {
            return this.balance;
        }

        public void deposit(int amount) {
            if (amount > 0) {
                this.balance += amount;
            }

        }

        public void withdraw(int amount, String pin) {
            if (pin.equals(this.correctPin) && amount > 0 && this.balance > amount) {
                this.balance -= amount;
            }

        }
    }


