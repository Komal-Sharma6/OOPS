public class Restaurant {
    public String restaurantName;
    public long restaurantContact;
    public String restaurantAddress;
    public double restaurantRating;

    public void displayRestaurantDetails(){
        System.out.println("Reataurant Details");
        System.out.println("Name: "+restaurantName);
        System.out.println("Address: "+restaurantAddress);
        System.out.println("Contact Number: "+restaurantContact);
        System.out.println("Rating: "+restaurantRating);
        System.out.println();
    }
    Restaurant(String restaurantName,long restaurantContact, String restaurantAddress,float restaurantRating){
        this.restaurantName=restaurantName;
        this.restaurantContact=restaurantContact;
        this.restaurantAddress=restaurantAddress;
        this.restaurantRating=restaurantRating;
    }
}
