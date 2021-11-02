public class Shoe {

    // Instance variables
    private double price;
    private Brand brand;
    private int size;
    private String color;

    // Full constructor
    public Shoe(double price, Brand brand, int size, String color){
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    // Getters and setters

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
