  public class Guest extends Customer {
    private float deliveryCharge;

    Guest(String cId,String cName, long contact, String address, float deliveryCharge) {
       super(cId,cName,contact,address);
        this.deliveryCharge = deliveryCharge;
    }
         public float getDeliveryCharge(){
             return deliveryCharge;
        }
        public void setDeliveryCharge(float deliveryCharge){
        this.deliveryCharge=deliveryCharge;
        }
    }

