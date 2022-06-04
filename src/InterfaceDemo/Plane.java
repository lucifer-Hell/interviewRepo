package InterfaceDemo;

public interface Plane {
    default void drive(){
        System.out.println("plane is driving");
    }
}
