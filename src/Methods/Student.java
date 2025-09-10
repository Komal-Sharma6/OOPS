package Methods;

public class Student {
  private int id;
  private String name;
  private  int age;

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        if(ID<0){
            System.out.println("Invalid id");
        }else{
            this.id = ID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age=0;
        }else{
            this.age = age;
        }

    }
}
