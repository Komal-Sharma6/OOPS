package MultiLevelInheritance;

public class Child extends Parent {
    Child(int age, String name){
        super(age,name);
        System.out.println("Child constructor called");
    }
    public void childMethod(){
        System.out.println("Child method called");
        super.parentMethod();
        System.out.println(super.getAge());
    }
}
