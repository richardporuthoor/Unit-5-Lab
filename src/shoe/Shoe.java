package shoe;

public class Shoe {
    // Instance variables
    private String name;
    private int price;
    private Brand brand;

    // Full constructor
    public Shoe(String name, int price, Brand brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    // toString Method
    public String toString(){
        String output = "";
        output += "\tName:\t\t" + name + "\n";
        output += "\tshoe.Brand:\t\t" + brand.getName() + "\n";
        return output;
    }
}
