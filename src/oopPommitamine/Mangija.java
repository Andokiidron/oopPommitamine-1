package oopPommitamine;

import java.util.Scanner;

public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kuhuLasta() {
        System.out.println("Sisesta koordinaadid formaadis YYY-XXX");
        String[] input = sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]) - 1;
        int y = Integer.parseInt(input[1]) - 1;
        return new int[]{x,y};
    }

    public void pihtas() {
        System.out.println("Said pihta");
    }

    public void moodas() {
        System.out.println("Läks mööda");
    }

    public void gameover() {
        System.out.println("It's over");
    }
}
