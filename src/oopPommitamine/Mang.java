package oopPommitamine;

public class Mang {
    public Mang() {

//        mängu seadistada
        Meri meri= new Meri(10);
        

        Mangija mangija = new Mangija();

//        mängu töös hoidmine
        while (meri.laevuOnAlles()) {
            meri.kuvaLaud();
            int[] lask = mangija.kuhuLasta();
            boolean pihtas = meri.saiPihta(lask);
            if (pihtas){
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
//        kui mäng on läbi, mis siis
        mangija.gameover();
    }
}