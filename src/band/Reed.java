package band;

public class Reed {
    private String type;
    private double size;
    private String brand;
    private static int metronome = 0;

    public Reed(String type, double size, String brand) {
        this.type = type;
        this.size = size;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
