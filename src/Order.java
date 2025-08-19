public class Order {
    public int orderId;
    public String orderedFoods;
    public String status;
    public double totalPrice;

    public double calculateTotalPrice(){
      totalPrice=totalPrice*(1+5/100);
      return totalPrice;
    }

    public void displayOrderDetails(){
        System.out.println("Order Details");
        System.out.println("Order ID: "+orderId);
        System.out.println("Ordered Food: "+orderedFoods);
        System.out.println("Order Status: "+status);
        System.out.println("Total Price: "+totalPrice);
        System.out.println();
    }
    public void orderStatus(){
        System.out.println("Status of Orer1: "+status);
    }

    public void orderStatusIdOrderedFoods(){
        System.out.println("Status of Order 2: "+status);
        System.out.println("ID of order 2: "+orderId);
        System.out.println("Food ordered in Order 2: "+orderedFoods);
        System.out.println();
    }

    Order(int orderId, String orderedFoods, String status, double totalPrice){
         this.orderId= orderId;
         this.orderedFoods= orderedFoods;
         this.status=status;
         this.totalPrice=totalPrice;

    }
    Order(){
        status="Ordered";
    }
    Order(int orderId,String orderedFoods){
        this.orderId=orderId;
        this.orderedFoods=orderedFoods;
        status="Ordered";
    }
}
