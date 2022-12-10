package Composition;

public class MotherBoard {
    private String bios;
    private String type;

    public MotherBoard(String bios, String type) {
        this.bios = bios;
        this.type = type;
    }

    public String getBios() {
        return bios;
    }

    public String getType() {
        return type;
    }
}
