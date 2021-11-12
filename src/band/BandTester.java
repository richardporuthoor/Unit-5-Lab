package band;

public class BandTester {
    public static void main(String[] args) {
        Woodwind saxophone = new Woodwind("Saxophone", new Reed("Single", 2.5, "Vandoren"), "Yamaha", 100, "E flat", "ABC");
        Brass trumpet = new Brass("Trumpet", "Yamaha", 80, "B flat", true, "ABC");


        System.out.println(saxophone);
        System.out.println();
        System.out.println(trumpet);

        saxophone.convert();
        trumpet.convert();
    }


}
