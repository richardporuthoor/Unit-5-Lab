package band;

public class Brass {
    private String instrument;
    private String brand;
    private int volume;
    private String pitch;
    private Boolean keys;
    private String notes;
    private static int metronome = 0;

    public Brass(String instrument, String brand, int volume, String pitch, Boolean keys, String notes) {
        this.instrument = instrument;
        this.brand = brand;
        this.volume = volume;
        this.pitch = pitch;
        this.keys = keys;
        this.notes = notes;
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

    public String getNotes() {return notes;}

    public void setNotes(String notes) {this.notes = notes;}

    public static int getMetronome() {return metronome;}

    public static void setMetronome(int metronome) {Brass.metronome = metronome;}

    /**
     * This method prints the information about the objects
     * @return string of information about the object.
     */
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
    /**
     * This method converts the notes based on the pitch of the instrument.
     * It then prints the new notes.
     */
    public String convert(){
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
            metronome++;
        }
        return newNotes;
    }
}
