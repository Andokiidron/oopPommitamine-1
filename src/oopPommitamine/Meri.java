package oopPommitamine;

public class Meri {

    private int lauaServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus) {
        lauaServaPikkus = pikkus;
        tekitalaevastik();

    }

    private void tekitalaevastik() {
        for (int i = 0; i < laevastik.length; i = i + 1) {
            laevastik[i] = new Laev(i + 1, lauaServaPikkus);
        }
    }

    public boolean laevuOnAlles() {
        for (int i = 0; i < laevastik.length; i++) {
            boolean elus = laevastik[i].oledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean saiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasTabas(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaLaud() {
        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {

                boolean onLaev = kasLaevOnSiin(i, j);
                if (onLaev) {
                    System.out.print("O");
                } else {
                    System.out.print("~"); // ln võtsime ära sest println teeb uue rea
                }
            }
            System.out.println();
        }
    }

    private boolean kasLaevOnSiin(int i, int j) {
        for (Laev laev : laevastik) {
            if (laev.oledSiin(i, j)) {
                return true;
            }

        }
        return false;
    }
}
