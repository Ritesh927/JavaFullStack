package Trying;

interface Vehicle {
    void run();
}

interface Car extends Vehicle {
    void run();
}

interface Bus extends Vehicle, Car {
    void run();
}

class Implementation implements Bus {

    @Override
    public void run() {
        System.out.println("Running.......");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        Implementation imp = new Implementation();
//        imp.run();
        Bus b = imp;
        b.run();
    }
}