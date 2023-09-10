package Kavi.program1.CatExample;

public class Cat {

    // this class should follow best practices
    // instance variable (access modifier -> data type -> variable name)

    private String name;
    private int weight;
    private String color;

    // constructors

    public Cat() {
        // this is default constructor
        System.out.println("I am default constructor");
    }

    public Cat(String name, int weight, String color) {
        // all argument constructor
        this.name = name;
        this.weight = weight;
        this.color = color;
        System.out.println("I am all argument constructor");
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color =color;
    }

    // getters -> to get the value of the instance variables

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // setters
    public void setName(String name) {
        this.name=name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // object methods
    // give a name to kitty according to weight

    public void giveMeName(int weight){
        if(weight<10) {
            this.name = "Kettu poosa";
            System.out.println("Now I am called " + this.name);
        }else if((weight>10) && (weight<20)) {
            this.name = "Hoda possa";
            System.out.println("Now I am called " + this.name);
        }else if ((weight>20) && (weight<30)) {
            this.name = "Mahatha possa";
            System.out.println("Now I am called " + this.name);
        }else{
            this.name="Mala peretha poosa";
            System.out.println("Now I am called " + this.name);
        }
    }
}
