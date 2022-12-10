package Composition;

public class main {
    public static void main(String[] args) {

        // case
        Case casePC = new Case(new Dimension(12,34,12));

        // monitor
        Moniter moniter = new Moniter("Azus", new Resolution(1240, 1280));

        // mother baord
        MotherBoard motherBoard = new MotherBoard("No","Intel");

        Pc pc = new Pc(casePC,moniter, motherBoard); // object of pc

        // access to the inner methods
        pc.getMoniter().drawShape(10,21);

    }
}


// inheritance relatioship - is a
// compositon relationship - has a

// car IS A vehicle
// computer HAS A mother board, monitor and case

// use composition vs inheritance -> check use of composition first




