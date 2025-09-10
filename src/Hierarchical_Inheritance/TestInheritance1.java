package Hierarchical_Inheritance;

public class TestInheritance1 {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.setAge(5);
        System.out.println(dog1.getAge());
        dog1.setName("jai");
        System.out.println(dog1.getName());
        dog1.sayHello();
        dog1.eat();

     Animal cat = new Cat();
        cat.sayHello();
        //cat.breed(); can not call method of Cat class with Animal class reference.
    }
}
