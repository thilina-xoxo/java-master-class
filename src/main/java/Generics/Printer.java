package Generics;

import java.io.Serializable;

public class Printer<T> {
    private T thingsToPrint;

    public Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void printer() {
        System.out.println(this.thingsToPrint);
    }
}

// now this printer can be used with any type
