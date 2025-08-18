//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Customer {
    public String customerID;
    public String customerName;
    public String customerAddress;
    public long contactNumber;

   public void displayCustomerDetails(){
       System.out.println("Displaying customer details \n***********");
       System.out.println("Customer ID: "+ customerID);
       System.out.println("Customer Name: "+customerName);
       System.out.println("Contact Number: "+ contactNumber);
       System.out.println("Customer Address: "+customerAddress);
       System.out.println();
   }
}