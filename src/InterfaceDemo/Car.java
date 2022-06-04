package InterfaceDemo;

public interface Car {
    default void drive(){
        System.out.println("car is driving");
    }
}
