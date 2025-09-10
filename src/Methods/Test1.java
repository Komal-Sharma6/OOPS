package Methods;

public class Test1 {
    public static void main(String[] args){

        Bank bank1 = new Bank();
        bank1.setAccountNo(10841615);

        System.out.println(bank1.getBalance());
        bank1.deposit(100);
        bank1.withdraw(110);
        bank1.withdraw(90);
        System.out.println(bank1.getBalance());
    }
}
