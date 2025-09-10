//TestInheritance1 test class
package Hierarchical_Inheritance;

public class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("This animal eats food");
    }
    public void sayHello(){
        System.out.println("");
    }
}
