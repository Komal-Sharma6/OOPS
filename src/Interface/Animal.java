package Interface;

public interface Animal {
    public static final int MAX_AGE=100;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is interface");
    }

    public default void run(){
        System.out.println("I run");
    }
}
