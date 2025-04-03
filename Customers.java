public class Customers {
private int accountNumber;
private double balanceAtTheBeginningOfTheMonth;
private double totalCharges;
private int totalMonthlyCredit;
private int allowedCredit   = 100000;
private double newBalanceAtTheBeginningOfTheMonth;
 public Customers(int accountNumber, double balanceAtTheBeginningOfTheMonth, double totalCharges, int totalMonthlyCredit, int allowedCreditLimit) { 
this.accountNumber = accountNumber;
this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
this.totalCharges = totalCharges;
this.totalMonthlyCredit = totalMonthlyCredit;
this.allowedCredit = allowedCredit; 
}
public void setaccountNumber(int accountNumber) {
this.accountNumber = accountNumber;
}
public int getaccountNumber() {
return accountNumber;
}
public void setbalanceAtTheBeginningOfTheMonth(double balanceAtTheBeginningOfTheMonth) {
this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
}
public double getbalanceAtTheBeginningOfTheMonth() {
return balanceAtTheBeginningOfTheMonth;
}
public void settotalCharges(double totalCharges) {
this.totalCharges = totalCharges;
}
public double gettotalCharges() {
return totalCharges;
}
public void settotalMonthlyCredit(int totalMonthlyCredit) {
this.totalMonthlyCredit = totalMonthlyCredit;
}
public int gettotalMonthlyCredit() {
return totalMonthlyCredit ;
}
public void setallowedCredit (int allowedCredit ) {
this.allowedCredit = allowedCredit;
}
public int getallowedCredit() {
return allowedCredit ;
}


public boolean isLimitExceeded(double newBalanceAtTheBeginningOfTheMonth) {
newBalanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth + totalCharges - totalMonthlyCredit ;
if( getallowedCredit() > newBalanceAtTheBeginningOfTheMonth ){
return false;
}else
 return true;
}
}



 


