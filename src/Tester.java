class Tester {
    public static void main (String[] args){

        //Object for Customer class
        Customer customer1 = new Customer("C101","Stephen Abram",1234565131L,"12 Bihar Colony");
        customer1.displayCustomerDetails();

        Customer customer2 = new Customer();
        customer2.displayCustomerDetails();

        Customer customer3 = new Customer("Priya", 7362678L, "Sodala");
        customer3.displayCustomerDetails();


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

        //Object for Order class

        Order order1 = new Order(101, "Spinach Alfredo", "Ordered",180);
        order1.calculateTotalPrice();
        order1.displayOrderDetails();

        Order order2 =new Order();
        order2.orderStatus();

        Order order3 = new Order(1002,"Pizza");
        order3.orderStatusIdOrderedFoods();


        //Object for Restaurant class

        Restaurant restaurant1 = new Restaurant("Paradise",6737569l,"Mumbai Andheri", 4.1f);
        restaurant1.displayRestaurantDetails();

    }
}
