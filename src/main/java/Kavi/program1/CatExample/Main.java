package Kavi.program1.CatExample;

public class Main {

    public static void main(String[] args) {

        // cat object
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Kitty",5,"White");
        Cat cat3 = new Cat("Kitty2",25,"White2");
        Cat cat4 = new Cat("Kitty3",35,"White3");
        Cat cat5 = new Cat("Kitty4",55,"White4");

        // try to assign values
        System.out.println("Cat2 intial weight " + cat2.getWeight());
       // cat2.setWeight(45);
        //System.out.println("Now Cat2 weight " + cat2.getWeight());

        // calling method
        cat2.giveMeName(cat2.getWeight());
        cat3.giveMeName(cat3.getWeight());
        cat4.giveMeName(cat4.getWeight());
        cat5.giveMeName(cat5.getWeight());

    }


}
