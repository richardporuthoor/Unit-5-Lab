package band;

public class BandTester {
    public static void main(String[] args) {
        Woodwind saxophone = new Woodwind("Saxophone", new Reed("Single", 2.5, "Vandoren"), "Yamaha", 100, "Eb");

        System.out.println(saxophone);
    }
}
