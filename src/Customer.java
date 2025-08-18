//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Customer {
    public String customerID;
    public String customerName;
    public String customerAddress;
    public long contactNumber;

    Customer (String cId,String cName, long contact, String address){
        System.out.println("Parametrized Costructor Called");
        customerID=cId;
        customerName=cName;
        contactNumber=contact;
        customerAddress= address;

    }
    Customer (){
        System.out.println("Non-Parametrized Constructor Called");
    }

   public void displayCustomerDetails(){
       System.out.println("Displaying customer details \n***********");
       System.out.println("Customer ID: "+ customerID);
       System.out.println("Customer Name: "+customerName);
       System.out.println("Contact Number: "+ contactNumber);
       System.out.println("Customer Address: "+customerAddress);
       System.out.println();
   }
}