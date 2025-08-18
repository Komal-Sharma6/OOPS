 class Food {
    public String foodName;
    public String cusine;
    public String foodType;
    public String quantityAvailable;
    public int unitPrice;

    public void viewFoodDetails(){
        System.out.println("Food Name: "+foodName);
        System.out.println( "Cusine: "+cusine);
        System.out.println( "Typse: "+foodType);
        System.out.println("Quantity:"+quantityAvailable);
        System.out.println("Unit Price: "+unitPrice);
        System.out.println();
    }
}
