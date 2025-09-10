package Methods;

public class Bank {
    private long accountNo;
    private double balance;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }



    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
           balance-=amount;
        }
        else{
            System.out.println("Invalid amount or Insufficient balance ");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}
