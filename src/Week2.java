import java.util.Scanner;

public class Week2 {
    public Week2(Scanner iptW2){
        int chc;
        System.out.println("git");
        System.out.print("soal: ");
        chc = iptW2.nextInt();
        iptW2.nextLine();
        switch (chc){
            case 1: soal1(iptW2);break;
            case 2: soal2(iptW2);break;
            case 3: soal3(iptW2);break;
            default: break;
        }

    }
    void soal1(Scanner s1){
        System.out.print("Masukkan bulan (1-12): ");
        int x = s1.nextInt();
        int cat = (x + 1) % 9 % 2;
        if(x == 2) cat = 2;
        String[] bulan = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Des"};
        System.out.println("Bulan " + bulan[x-1] + " memiliki " + (cat==0?"31":cat==1?"30":"28/29") + " hari");

    }
    void soal2(Scanner s2){
        System.out.print("Masukkan angka: ");
        int x = s2.nextInt();

        System.out.println("Angka " + x + " adalah" + (fPrime(x)?"":" bukan") + " angka prima");
    }
    void soal3(Scanner s3){
        System.out.print("Range bawah excl: ");
        int i = s3.nextInt();
        System.out.print("Range atas excl: ");
        int j = s3.nextInt();

        int total = 0;
        for(int n = i+1;n<j;n++){
            if(fPrime(n)) total += n;
        }
        System.out.println("Sum prime from " + i + " to " + j + " = " + total);

    }

    boolean fPrime(int x){
        boolean prime = x > 1;
        for (int i = 2; prime && i < Math.ceil(Math.sqrt(x)); i++) {
            if(x % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
