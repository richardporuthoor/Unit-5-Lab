package band;

public class Brass {
    private String instrument;
    private String brand;
    private int volume;


    public Brass(String instrument, String brand, int volume, int range) {
        this.instrument = instrument;
        this.brand = brand;
        this.volume = volume;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
