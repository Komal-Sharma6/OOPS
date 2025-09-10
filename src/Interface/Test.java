package Interface;

public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();
         dog.eat();
         dog.sleep();

         Animal cat = new Cat();
         cat.eat();
         cat.sleep();

         System.out.println(dog.MAX_AGE);
         System.out.println(cat.MAX_AGE);

         Animal.info();
    }
}
