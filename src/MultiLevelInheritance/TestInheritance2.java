package MultiLevelInheritance;

public class TestInheritance2 {
    public static void main(String[] args){
        Child child1 = new Child(12,"harsh");
        child1.setAge(4);
      System.out.println( child1.isHasSuperPowers() );
      child1.childMethod();
      Parent parent1 =new Parent(13,"bhanu");
      parent1.setAge(30);

    }
}
