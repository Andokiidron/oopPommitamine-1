package oopPommitamine;

import java.util.Arrays;
import java.util.Random;

public class Laev {

    private int laevaPikkus;
    private int[] koordinaadid;
    private boolean elus;


    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKoordinaadid(lauaServaPikkus);
    }

    private void genereeriKoordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        koordinaadid = new int[] {x, y};

    }

    public boolean oledElus() {
        return true;
    }

    public boolean kasTabas(int lask[]) {
        if (Arrays.equals(koordinaadid, lask)){
            elus = false;
            return true;
        }
        return false;
    }

    public boolean oledSiin(int x, int y) {
        if (x == koordinaadid[0] && y == koordinaadid[1]){
            return true;

        }
        return false;
    }
}
