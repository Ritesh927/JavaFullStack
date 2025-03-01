package Trying;

abstract class Animal {
    abstract void makeSound();  // Abstract method

    //    abstract int city; // can't declare an abstract variable in abstract class
    String name;
    static int num;

    public Animal(String name) {
        this.name = name;
    }

    static void setNum(int num) {
        Animal.num = num;
    }

    void sleep() {              // Concrete method
        System.out.println(name + " is sleeping and her number : " + num);
    }

    static void describe() {    // Static method
        System.out.println("Animals are living beings.");
    }

    final void breathe() {  // Final method
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {          // Implementing abstract method
        System.out.println(name + " barks.");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Animal.setNum(1);
        Dog d = new Dog("Malokwa");
        d.makeSound();
        d.sleep();
        d.breathe();
        Animal.describe();
    }
}