package Composition;

public class Moniter {
    private String model;
    private Resolution resolution;

    public Moniter(String model, Resolution resolution) {
        this.model = model;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void drawShape(int x, int y) {
        System.out.println("The shape is at "+ x + " , " + y);
    }
}
