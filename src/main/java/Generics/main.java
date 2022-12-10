package Generics;

// generics
// bounded generics extends via Interfaces or classes - put class first not interface
// generics methods
// wild cards - when we do not know what is the type parameter exactly

public class main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(10);
        printer.printer();

        Printer<Double> printerD = new Printer<>(10.5);
        printerD.printer();

    }


}

