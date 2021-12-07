package band;

public class BandTester {
    public static void main(String[] args) {
        Woodwind saxophone = new Woodwind("Saxophone", new Reed("Single", 2.5, "Vandoren"), "Yamaha", 100,
                "E flat", "DAB");
        Brass trumpet = new Brass("Trumpet", "Yamaha", 80, "B flat", true, "EGB");


        System.out.println(saxophone);
        System.out.println();
        System.out.println(trumpet);
        play(saxophone, trumpet);
        louder(saxophone, trumpet);
    }

    public static void play(Woodwind instrument1, Brass instrument2){
        System.out.println("Woodwind Instrument: " + instrument1.getInstrument());
        System.out.println("Original Notes: " + instrument1.getNotes());
        System.out.println("Pitch: " + instrument1.getPitch());
        System.out.println("New Notes: " + instrument1.convert());
        System.out.println();
        System.out.println("Brass Instrument: " + instrument2.getInstrument());
        System.out.println("Original Notes: " + instrument2.getNotes());
        System.out.println("Pitch: " + instrument2.getPitch());
        System.out.println("New Notes: " + instrument2.convert());
        System.out.println();
        System.out.println("Total Notes: " + (instrument1.getMetronome() + instrument2.getMetronome()));
        System.out.println();
    }

    public static void louder(Woodwind instrument1, Brass instrument2){
        if(instrument1.getVolume() > instrument2.getVolume()){
            System.out.println("That " + instrument1.getInstrument() + " sure is loud!");
        } else if (instrument2.getVolume() > instrument1.getVolume()){
            System.out.println("That " + instrument2.getInstrument() + " sure is loud!");
        } else{
            System.out.println("Those instruments sure are loud.");
        }
    }
}
