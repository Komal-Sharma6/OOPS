public class RegularCustomer extends Customer{
    private float discount;

    RegularCustomer(String cId,String cName, long contact, String address,float discount){
        super(cId,cName,contact,address);
        this.discount=discount;
    }
    public float getDiscount(){
        return discount;
    }

    public void setDiscount(float discount){
        this.discount=discount;
    }
    @Override
    public void payBill(double price, double discountPercentage){
           double totalPrice = (price *(1-0.05))*95/100;
           System.out.println("Total Price:"+totalPrice);
    }
}
