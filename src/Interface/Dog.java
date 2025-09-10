package Interface;

public class Dog implements Animal {

    @Override
    public void eat() {
      System.out.println("I eat");
    }

    @Override
    public void sleep() {
     System.out.println("I sleep");
    }
}
