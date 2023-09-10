package Kavi.program1.DogExample;

public class Main {
    public static void main(String[] args) {

        // create objects using Dog class
        // Object - 1
        Dog blackDog = new Dog();

        // assign values of the object instance fields

        blackDog.color="Black";
        blackDog.name="Kalu";
        blackDog.size=10;

        blackDog.dogAction();

        System.out.println(blackDog);
        System.out.println(blackDog.color);

        // Object -2
        Dog whiteDog = new Dog(); // default constructor
        whiteDog.color="white";
        whiteDog.name="Sudu";
        whiteDog.size=8;

        System.out.println("This is for white dog");
        whiteDog.dogAction();
        System.out.println(whiteDog);

    /*
    Note - Multiple objects can be created using one class.
    Creating class without aceess modifiers is not a best practice.
    Object oriented principes
    Abstraction - todo
    Encapsulation (data hiding) - Now focus
    Polymorphism - todo
    Inheritance - todo
     */

    }
}
