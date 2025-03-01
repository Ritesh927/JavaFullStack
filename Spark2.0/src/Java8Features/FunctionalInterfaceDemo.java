package Java8Features;

@FunctionalInterface
interface Car {
    void drive(int speed, int mileage);
//    void task();

    static void gps() {
        System.out.println("In static method of Car -----GPS is working perfectly.");
    }

    default void musicSystem() {
        System.out.println("In default method of Car -----Syyysssttuuummm...");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Car car = (speed, mileage) -> System.out.println("In abstract method of Car ----Speed : " + speed + " Mileage : " + mileage);

        car.drive(88, 17);
        Car.gps();
        car.musicSystem();
    }
}