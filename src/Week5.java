import week5Class.*;
import java.util.Scanner;

public class Week5 {
    public Week5(Scanner iptW5) {
        int chc;
        double pts1, pts2;
        String warna;
        while (true){
            System.out.println("----------------------");
            System.out.print("Warna: ");
            warna = iptW5.nextLine();
            System.out.println("----Bangun Ruang----");
            System.out.println("1. Lingkaran");
            System.out.println("2, Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            chc = iptW5.nextInt();
            iptW5.nextLine();
            switch (chc){
                case 1:
                    System.out.println("--Lingkaran--");
                    System.out.print("Jari-jari: ");
                    pts1 = iptW5.nextDouble();
                    iptW5.nextLine();
                    Circle c = new Circle(warna,pts1);
                    c.out();
                    break;
                case 2:
                    System.out.println("--Persegi--");
                    System.out.print("Sisi: ");
                    pts1 = iptW5.nextDouble();
                    iptW5.nextLine();
                    Sqr s = new Sqr(warna,pts1);
                    s.out();
                    break;
                case 3:
                    System.out.println("--Persegi Panjang--");
                    System.out.print("Panjang: ");
                    pts1 = iptW5.nextDouble();
                    iptW5.nextLine();
                    System.out.print("Lebar: ");
                    pts2 = iptW5.nextDouble();
                    iptW5.nextLine();
                    Rect r = new Rect(warna,pts1,pts2);
                    r.out();
                    break;
                case 4:
                    System.out.println("--Segitiga Siku--");
                    System.out.print("Alas: ");
                    pts1 = iptW5.nextDouble();
                    iptW5.nextLine();
                    System.out.print("Tinggi: ");
                    pts2 = iptW5.nextDouble();
                    iptW5.nextLine();
                    Trig t = new Trig(warna,pts1,pts2);
                    t.out();
                    break;
                case 5: break;
                default:
                    System.out.println("Input tidak valid"); break;
            }
            if(chc == 5) return;
        }
    }
}
