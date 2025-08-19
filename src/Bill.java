public class Bill {
    public String billId;
    public String payamentMode;

    public void payBill(double price, double discountPercentage){
        double totalPrice= price*(1-(discountPercentage/100));
        System.out.println("Total Payable Amount: "+ totalPrice);
        System.out.println();

    }
}
