import week4Class.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4 {
    public static Barang[] barangs = {
            new Barang(1, 120,2000,"Pulpen Easy Gel 0.5mm"),
            new Barang(2,30,5000,"Penggaris 30cm"),
            new Barang(3,30,7000,"Tipe-x Roller"),
            new Barang(4,50,5000,"Pensil Mekanik"),
            new Barang(5,100,6000,"Buku Tulis")
    };
    public Week4(Scanner iptW4){
        int chc;
        List<Order> orders = new ArrayList<>();
        while(true){
            System.out.println("----Menu Toko Multiguna----");
            System.out.print("1. Pesan Barang\n2. Lihat Pesanan\nPilihan: ");
            chc = iptW4.nextInt();
            iptW4.nextLine();
            if(chc == 2){
                SeeAll(orders);
            } else if (chc == 1) {
                Menu();
                chc = iptW4.nextInt();
                iptW4.nextLine();
                if(chc < 1 || chc > barangs.length) {
                    System.out.println("Tidak Valid");
                    continue;
                }
                Barang tempBarang = barangs[chc-1];
                System.out.print("Jumlah: ");
                chc = iptW4.nextInt();
                iptW4.nextLine();
                if(chc > tempBarang.get_stock() || chc < 1){
                    System.out.println("Tidak Valid");
                    continue;
                }
                int tempSt = chc;
                System.out.println(chc + " @ " + tempBarang.get_nama() + " dengan total harga " + (tempBarang.get_harga() * chc));
                System.out.print("Masukkan jumlah uang: ");
                chc = iptW4.nextInt();
                iptW4.nextLine();
                if(chc < tempSt  * tempBarang.get_harga()){
                    System.out.println("Jumlah uang tidak mencukupi");
                    continue;
                }
                orders.add(new Order(orders.size() + 1, tempSt, tempBarang));
                Order.total += tempSt  * tempBarang.get_harga();
                tempBarang.minusQty(tempSt);
                System.out.println("Berhasil dipesan");

            } else break;

        }
    }
    public void Menu(){
        System.out.println("Daftar Barang Toko Multiguna");
        for(Barang b : barangs){
            System.out.printf("%-6s: %d\n%-6s: %s\n%-6s: %d\n%-6s: %d\n", "ID", b.get_id(),
                    "Nama", b.get_nama(), "Stock", b.get_stock(), "Harga", b.get_harga());
            System.out.println("-----------------------------");
        }
        System.out.println("Ketik 0 untuk batal");
        System.out.print("Pesan: ");
    }
    public void SeeAll(List<Order> orders){
        System.out.println("Daftar pesanan toko multiguna");
        for(Order o : orders){
            System.out.printf("%-7s: %d\n%-7s: %s\n%-7s: %d\n", "ID", o.get_id(),
                    "Nama", o.get_barang().get_nama(), "Jumlah", o.get_jumlah());
            System.out.println("-----------------------------");
        }
        System.out.printf("%-7s: %d\n", "Total", Order.total);
        System.out.println("-----------------------------");
    }
}
