package band;

public class Brass {
    private String instrument;
    private String brand;
    private int volume;
    private String pitch;
    private Boolean keys;

    public Brass(String instrument, String brand, int volume, String pitch, Boolean keys) {
        this.instrument = instrument;
        this.brand = brand;
        this.volume = volume;
        this.pitch = pitch;
        this.keys = keys;
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

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public Boolean getKeys() {
        return keys;
    }

    public void setKeys(Boolean keys) {
        this.keys = keys;
    }

    public String toString(){
        String output = "";
        output += "\tBrass\n";
        output += "\t\t-Name:\t\t" + instrument + "\n";
        output += "\t\t-Brand:\t\t" + brand + "\n";
        output += "\t\t-Volume:\t" + volume + "\n";
        output += "\t\t-Pitch:\t\t" + pitch + "\n";
        output += "\t\t-Uses Keys:\t" + keys + "\n";
        return output;
    }
}
