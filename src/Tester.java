class Tester {
    public static void main (String[] args){

        //Object for Customer class
        Customer customer = new Customer();
        customer.customerID="C101";
        customer.customerName="Stephen Abram";
        customer.contactNumber =1234565131L;
        customer.customerAddress="12 Bihar Colony";

        customer.displayCustomerDetails();

        //object for Food class
        Food food1 = new Food();
        food1.foodName="Pasta";
        food1.cusine="Italian";
        food1.foodType="Veg";
        food1.quantityAvailable="2";
        food1.unitPrice=120;

        food1.viewFoodDetails();

        //object for Bill class

        Bill bill1 = new Bill();

        bill1.billId="B001";
        bill1.payamentMode="Cash";

        bill1.payBill(100,20);

    }
}
