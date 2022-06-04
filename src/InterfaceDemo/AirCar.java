package InterfaceDemo;

public class AirCar implements Plane,Car {
    @Override
    public void drive(){
        Plane.super.drive();
        Car.super.drive();
    }
    public static void main(String[] args) {
        AirCar c2=new AirCar();
        c2.drive();
    }

}
