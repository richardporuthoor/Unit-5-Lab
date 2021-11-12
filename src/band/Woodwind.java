package band;

public class Woodwind {
    // Instance variables
    private String instrument;
    private Reed reed;
    private String brand;
    private int volume;
    private String pitch;
    private String notes;
    private static int metronome = 0;

    public Woodwind(String instrument, Reed reed, String brand, int volume, String pitch, String notes) {
        this.instrument = instrument;
        this.reed = reed;
        this.brand = brand;
        this.volume = volume;
        this.pitch = pitch;
        this.notes = notes;
    }

    public String getName() {
        return instrument;
    }

    public void setName(String name) {
        this.instrument = instrument;
    }

    public Reed getReed() {
        return reed;
    }

    public void setReed(Reed reed) {
        this.reed = reed;
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

    public String toString(){
        String output = "";
        output += "\tWoodwind\n";
        output += "\t\t-Name:\t\t" + instrument + "\n";
        output += "\t\t-Brand:\t\t" + brand + "\n";
        output += "\t\t-Volume:\t" + volume + "\n";
        output += "\t\t-Pitch:\t" + pitch + "\n\n";
        output += "\t\tReed\n";
        output += "\t\t\t-Brand:\t\t" + reed.getBrand() + "\n";
        output += "\t\t\t-Type:\t\t" + reed.getType() + "\n";
        output += "\t\t\t-Size:\t\t" + reed.getSize() + "\n";
        return output;
    }

    public void convert(){
        String noteList = "ABCDEFG";
        String newNotes = "";
        for (int i = 0; i < notes.length(); i++){
            for(int j = 0; j < noteList.length(); j++){
                if(notes.charAt(i) == noteList.charAt(j)){
                    if(pitch.equals("E flat")){
                        if(j == 0){
                            newNotes += noteList.charAt(noteList.length() - 2);
                        } else if(j == 1){
                            newNotes += noteList.charAt(noteList.length() - 1);
                        } else{
                            newNotes += noteList.charAt(j-2);
                        }
                    } else if(pitch.equals("B flat")){
                        if(j == noteList.length()-1){
                            newNotes += noteList.charAt(0);
                        } else{
                            newNotes += noteList.charAt(j+1);
                        }
                    } else{
                        newNotes += noteList.charAt(j);
                    }
                }
            }
        }
        System.out.println(newNotes);
    }
}
