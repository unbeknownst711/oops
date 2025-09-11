package tutorialClass;

import java.util.Scanner;

public class T4Main {
    static MatKul[] matkuls = new MatKul[9];
    public static void seedData(){
        matkuls[0] = new MatKul("if4","oop",3);
        matkuls[1] = new MatKul("if1","basic programning", 3);
        matkuls[2] = new MatKul("if5","ai",3);
        matkuls[3] = new MatKul("ce1","linear algebra",3);
        matkuls[4] = new MatKul("ce4","comnet",2);
        matkuls[5] = new MatKul("ce2","digital system",3);
        matkuls[6] = new MatKul("um16","pancasila",2);
        matkuls[7] = new MatKul("um15","agama",2);
        matkuls[8] = new MatKul("um14","indonesia",2);
    }
    public static void mainMenu(){
        System.out.println("----daftar matkul----");
        System.out.println("1. all\n2. if\n3. ce\n4. um");
    }
    public static void showData(){
        for(MatKul matkul : matkuls){
            System.out.println("--------------");
            System.out.println("Kode: " + matkul.getKode());
            System.out.println("Nama: " + matkul.getNama());
            System.out.println("Sks: " + matkul.getSks());
        }
    }
    public static void filterData(String x){
        for(MatKul matkul : matkuls){
            if(!matkul.getKode().contains(x)) continue;
            System.out.println("--------------");
            System.out.println("Kode: " + matkul.getKode());
            System.out.println("Nama: " + matkul.getNama());
            System.out.println("Sks: " + matkul.getSks());
        }
    }

    public static void start(Scanner iptT4) {
        seedData();
        int chc;
        while (true){
            mainMenu();
            System.out.println("Menu: ");
            chc = iptT4.nextInt();
            switch (chc){
                case 1: showData(); break;
                case 2: filterData("if"); break;
                case 3: filterData("ce"); break;
                case 4: filterData("um"); break;
                default: return;
            }
        }
    }
}
