package Composition;

public class Pc {
    private Case aCase;
    private Moniter moniter;
    private MotherBoard motherBoard;

    public Pc(Case aCase, Moniter moniter, MotherBoard motherBoard) {
        this.aCase = aCase;
        this.moniter = moniter;
        this.motherBoard = motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Moniter getMoniter() {
        return moniter;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
