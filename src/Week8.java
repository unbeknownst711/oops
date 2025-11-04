import week8Class.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Week8 {
    ArrayList<Item> itemLists= new ArrayList<>();
    ArrayList<Payment> paymentList= new ArrayList<>();
    void seedData(){
        itemLists.add(new Item("Kulkas","Elektronik", 4800000));
        itemLists.add(new Item("TV","Elektronik", 1280000));
        itemLists.add(new Item("Laptop","Komputer", 6000000));
        itemLists.add(new Item("PC", "Komputer", 12000000));
    }
    void printItem(Item item){
        System.out.println("Nama : " + item.getName());
        System.out.println("Tipe : " + item.getType());
        System.out.println("Harga: " + item.getPrice());
    }
    public Week8(Scanner iptW8) {
        int chc;
        seedData();
        while(true){
            menu();
            chc = iptW8.nextInt();
            if(chc == 1){
                int i = 1;
                for (Item item : itemLists) {
                    System.out.println("No. " + i++);
                    printItem(item);
                    System.out.println("----------------");
                }
                System.out.print(": ");
                chc = iptW8.nextInt();
                chc--;
                if(chc < 0 || chc >= itemLists.size()){
                    continue;
                }
                int ind = chc;
                System.out.println("1. Cash");
                System.out.println("2. Credit");
                System.out.print(": ");
                chc = iptW8.nextInt();
                Item temp = itemLists.get(ind);
                if(chc == 1) {
                    Payment temp1 = new Cash(temp);
                    System.out.print("Bayar sekarang? (Y/N): ");
                    char c = iptW8.next().charAt(0);
                    if(c == 'Y') {
                        int t = temp1.pay();
                        System.out.println("Harga: " + t);
                        while (true) {
                            System.out.print("Bayar: ");
                            int bayar = iptW8.nextInt();
                            if (bayar == t) {
                                System.out.println("Dibayar");
                                break;
                            }
                        }
                    }
                    paymentList.add(temp1);

                }
                else if(chc == 2) {
                    System.out.print("Jumlah cicilan(3/6/9/12): ");
                    int x = iptW8.nextInt();
                    if(x%3 != 0 && (x-1)/12 != 0) continue;

                    Payment temp1 = new Credit(temp, x);
                    int t = temp1.pay();
                    System.out.println("Harga: " + t);
                    while (true) {
                        System.out.print("Bayar: ");
                        int bayar = iptW8.nextInt();
                        if (bayar == t) {
                            System.out.println("Dibayar");
                            break;
                        }
                    }
                    paymentList.add(temp1);
                }
            } else if (chc == 2) {
                int i = 1;
                for (Payment p : paymentList){
                    System.out.println("No. " + i++);
                    show(p);
                    System.out.println("------------------");
                }
                System.out.print("no: ");
                chc = iptW8.nextInt();
                chc--;
                if(chc < 0 || chc >= paymentList.size()){
                    continue;
                }
                Payment temp1 = paymentList.get(chc);
                show(temp1);
                int t = temp1.pay();
                System.out.println("Harga: " + t);
                while (true) {
                    System.out.print("Bayar: ");
                    int bayar = iptW8.nextInt();
                    if (bayar == t) {
                        System.out.println("Dibayar");
                        break;
                    }
                }


            } else if (chc == 0) {
                return;
            }
        }

    }
    void menu(){
        System.out.println("--Toko Elektronik--");
        System.out.println("1. Pesan Barang");
        System.out.println("2. Lihat Pesanan");
        System.out.println("0. Keluar");
        System.out.print(": ");
    }
    void show(Payment p){
        System.out.println("Nama  : " + p.getItem().getName());
        System.out.println("Tipe  : " + p.getItem().getType());
        System.out.println("Status: " + p.getStatus());
        System.out.println("Sisa  : " + p.getRemainingAmount());
    }
}
