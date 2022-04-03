package taskagitmakas;

import java.util.Scanner;

public class TasKagitMakas {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Taş=1");
        System.out.println("Kağıt=2");
        System.out.println("Makas=3");
        System.out.println("  3 OLAN KAZANIR!");
        System.out.println("---SEÇİMİNİ YAP!---");

        int yp = 0, in = 0;
        int j = 0;

        for (int i = 3; i > 0; i--) {

            int rnd = (int) (Math.random() * 4);
            int secim = girdi.nextInt();

            switch (rnd) {
                case 0 ->
                    System.out.println("KAĞIT");
                case 1 ->
                    System.out.println("TAŞ");
                case 2 ->
                    System.out.println("KAĞIT");
                case 3 ->
                    System.out.println("MAKAS");
                default -> {
                }
            }

            if (secim < 4 && secim > 0) {
                if (secim == 1 && rnd == 3 || secim == 2 && rnd == 1 || secim == 3 && rnd == 2 || secim == 3 && rnd == 0) {
                    System.out.println("KAZANDIN!");
                    in++;
                } else if (secim == 3 && rnd == 1 || secim == 1 && rnd == 2 || secim == 1 && rnd == 0 || secim == 2 && rnd == 3) {
                    System.out.println("KAYBETTİN!");
                    yp++;
                } else {
                    System.out.println("BERABERE!");
                    i++;
                }
            } else {
                System.out.println("YANLIŞ GİRİŞ YAPTIN!");
                i++;
                j++;
            }
            if (i == 1) {

                System.out.println("            ---SKOR---");
                System.out.println("    Yapay Zeka " + yp + " - " + in + " İnsan(Sen)");
                if (in > yp) {

                    System.out.println("");
                    System.out.println(" YİNEDE BİR GÜN SİZİ ELE GEÇİRİCEZ!");

                } else {

                    System.out.println("");
                    System.out.println("       SİZDEN DAHA ZEKİYİZ ;)");

                }
            }

            if (j == 2) {

                System.out.println("");
                System.out.println("ABARTMA İSTERSEN!!");
                j++;

            } else if (j == 4) {

                System.out.println("");
                System.out.println("ALLAH'IN HAKKI ÜÇTÜR. BENİMLE OYNAMAYA YETİCEK ZEKAN YOK, BEN GİDİYOM.");
                System.out.println("");
                System.exit(0);
            }

        }

    }

}
