import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week10Class.*;

public class Week10 {
    List<Order> orders = new ArrayList<>();
    List<Barang> barangs = new ArrayList<>();
    public Week10(Scanner iptW6) {
        int chc;
        while(true) {
            lineBreak();
            chc = menuUtama(iptW6);
            lineBreak();
            switch (chc) {
                case 1:
                    menuPesanan(iptW6);
                    break;
                case 2:
                    showPesanan();
                    break;
                case 3:
                    addBarang(iptW6);
                    break;
                default:
                    return;
            }
        }

    }
    public int menuUtama(Scanner iptM1){
        System.out.println("----Menu Toko Voucher & HP----");
        System.out.println("1. Pesan Barang\n2. Lihat Pesanan\n3. Barang Baru");
        System.out.print("Pilihan: ");
        int chc = iptM1.nextInt();
        iptM1.nextLine();

        return chc;
    }
    private void showPesanan(){
        if(orders.isEmpty()){
            System.out.println("No order");
            return;
        }
        for(Order o : orders){
            if(o.get_handphone() != null){
                System.out.printf("%-7s: %s\n%-7s: %s %s\n%-7s: %d\n%-7s: %.0f\n", "ID", o.getId(), "Nama",
                        o.get_handphone().getNama(), o.get_handphone().getWarna(), "Jumlah", o.get_jumlah(),
                        "Total", o.get_handphone().getHarga() * o.get_jumlah());
            } else {
                System.out.printf("%-7s: %s\n%-7s: %s %.0f\n%-7s: %d\n%-7s: %.0f\n", "ID", o.getId(), "Nama",
                        o.get_voucher().getNama(), o.get_voucher().getHarga(), "Jumlah", o.get_jumlah(),
                        "Total", o.get_voucher().getHargaJual() * o.get_jumlah());
            }
        }
    }
    private void  menuPesanan(Scanner iptM2){
        System.out.println("--Pesan Barang--");
        lineBreak();
        String id;
        int jumlah;
        if(barangs.isEmpty()){
            return;
        }
        for (Barang b : barangs){
            if(b instanceof Voucher v){
                System.out.printf("%-8s: %s\n%-8s: %s\n%-8s: %.0f\n%-8s: %d\n%-8s: %.0f\n", "ID", v.getId(), "Nama",
                        v.getNama(), "Nominal", v.getHarga(),"Stok", v.getStok(), "Harga", v.getHargaJual());
            } else if(b instanceof Handphone h){
                System.out.printf("%-8s: %s\n%-8s: %s %s\n%-8s: %d\n%-8s: %.0f\n", "ID", h.getId(), "Nama",
                        h.getNama(), h.getWarna(),"Stok", h.getStok(), "Harga", h.getHarga());
            }
        }
        System.out.print("Pesan Barang (ID): ");
        id = iptM2.next();
        Barang temp = null;
        for (Barang b : barangs){
            if(b.getId().compareTo(id) == 0){
                temp = b;
                break;
            }
        }
        if(temp == null) return;
        System.out.print("Masukkan Jumlah: ");
        jumlah = iptM2.nextInt();
        if(jumlah < 1 || jumlah > temp.getStok()){
            System.out.println("Invalid Input");
            return;
        }
        if(temp instanceof Voucher v) {
            System.out.printf("%d @ %s %.0f dengan harga %.0f\n", jumlah, v.getNama(), v.getHarga(), v.getHargaJual() * jumlah);
            System.out.print("Masukkan jumlah uang: ");
            if (iptM2.nextInt() < v.getHargaJual() * jumlah) {
                System.out.println("Uang tidak cukup");
                return;
            }
            iptM2.nextLine();
            orders.add(new Order(("OV" + orders.size()), v, jumlah));
        } else if(temp instanceof Handphone h){
            System.out.printf("%d @ %s %s dengan harga %.0f\n", jumlah, h.getNama(), h.getWarna(), h.getHarga() * jumlah);
            System.out.print("Masukkan jumlah uang: ");
            if(iptM2.nextInt() < h.getHarga() * jumlah){
                System.out.println("Uang tidak cukup");
                return;
            }
            iptM2.nextLine();
            orders.add(new Order(("OH" + orders.size()), h, jumlah));
        }
        temp.minusStock(jumlah);
        System.out.println("Berhasil dipesan");



    }
    private void addBarang(Scanner iptM3){
        System.out.println("--Tambah Barang--");
        System.out.print("Voucher/Handphone (V/H): ");
        char type = iptM3.next().toUpperCase().charAt(0);
        iptM3.nextLine();
        if(type != 'V' && type != 'H'){
            System.out.println("Invalid Input");
            return;
        }
        System.out.print("Nama: ");
        String nama = iptM3.nextLine();
        System.out.print("Harga: ");
        int harga = iptM3.nextInt();
        System.out.print("Stok: ");
        int stok = iptM3.nextInt();
        iptM3.nextLine();
        if(type == 'V'){
            System.out.print("PPN: ");
            double pajak = iptM3.nextDouble();
            iptM3.nextLine();
            barangs.add(new Voucher("V"+(Voucher.total+1), harga, nama, stok, pajak));
        } else {
            System.out.print("Warna: ");
            String warna = iptM3.nextLine();
            barangs.add(new Handphone("H" + (Handphone.total+1), harga, nama, stok, warna));
        }
        System.out.println((type == 'V' ? "Voucher" : "Handphone") + " telah berhasil diinput");
    }
    private void lineBreak(){
        System.out.println("------------------------------");
    }

}
