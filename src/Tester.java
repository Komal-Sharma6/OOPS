class Tester {
    public static void main (String[] args){

        //Object for Customer class
        Customer customer1 = new Customer("C101","Stephen Abram",1234565131L,"12 Bihar Colony");

        Customer customer2 = new Customer();

        customer1.displayCustomerDetails();

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
