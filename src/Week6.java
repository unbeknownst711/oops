import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week6Class.*;

public class Week6 {
    List<Order> orders = new ArrayList<>();
    List<Handphone> hps = new ArrayList<>();
    List<Voucher> vouchers = new ArrayList<>();
    public Week6(Scanner iptW6) {
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
        System.out.print("Voucher/Handphone (V/H): ");
        char type = iptM2.next().toUpperCase().charAt(0);
        if(type != 'V' && type != 'H'){
            System.out.println("Invalid Input");
            return;
        }
        lineBreak();
        int id, jumlah;
        if(type == 'V'){
            if(vouchers.isEmpty()){
                System.out.println("No voucher");
                return;
            }
            for(Voucher v : vouchers){
                System.out.printf("%-8s: %d\n%-8s: %s\n%-8s: %.0f\n%-8s: %d\n%-8s: %.0f\n", "ID", v.getId(), "Nama",
                        v.getNama(), "Nominal", v.getHarga(),"Stok", v.getStok(), "Harga", v.getHargaJual());
            }
            System.out.print("Pesan Barang (ID): ");
            id = iptM2.nextInt();
            if(id < 1 || id > vouchers.size()){
                System.out.println("Invalid Input");
                return;
            }
            Voucher temp = vouchers.get(id-1);
            System.out.print("Masukkan Jumlah: ");
            jumlah = iptM2.nextInt();
            if(jumlah < 1 || jumlah > temp.getStok()){
                System.out.println("Invalid Input");
                return;
            }
            System.out.printf("%d @ %s %.0f dengan harga %.0f\n", jumlah, temp.getNama(), temp.getHarga(), temp.getHargaJual() * jumlah);
            System.out.print("Masukkan jumlah uang: ");
            if(iptM2.nextInt() < temp.getHargaJual() * jumlah){
                System.out.println("Uang tidak cukup");
                return;
            }
            iptM2.nextLine();
            orders.add(new Order(("OV" + orders.size()), temp, jumlah));
            temp.minusStock(jumlah);
            System.out.println("Berhasil dipesan");

        } else {
            if(hps.isEmpty()){
                System.out.println("No handphone");
                return;
            }
            for(Handphone h : hps){
                System.out.printf("%-8s: %d\n%-8s: %s %s\n%-8s: %d\n%-8s: %.0f\n", "ID", h.getId(), "Nama",
                        h.getNama(), h.getWarna(),"Stok", h.getStok(), "Harga", h.getHarga());
            }
            System.out.print("Pesan Barang (ID): ");
            id = iptM2.nextInt();
            if(id < 1 || id > hps.size()){
                System.out.println("Invalid Input");
                return;
            }
            Handphone temp = hps.get(id-1);
            System.out.print("Masukkan Jumlah: ");
            jumlah = iptM2.nextInt();
            if(jumlah < 1 || jumlah > temp.getStok()){
                System.out.println("Invalid Input");
                return;
            }
            System.out.printf("%d @ %s %s dengan harga %.0f\n", jumlah, temp.getNama(), temp.getWarna(), temp.getHarga() * jumlah);
            System.out.print("Masukkan jumlah uang: ");
            if(iptM2.nextInt() < temp.getHarga() * jumlah){
                System.out.println("Uang tidak cukup");
                return;
            }
            iptM2.nextLine();
            orders.add(new Order(("OH" + orders.size()), temp, jumlah));
            temp.minusStock(jumlah);
            System.out.println("Berhasil dipesan");
        }

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
            vouchers.add(new Voucher(vouchers.size()+1, harga, nama, stok, pajak));
        } else {
            System.out.print("Warna: ");
            String warna = iptM3.nextLine();
            hps.add(new Handphone(hps.size()+1, harga, nama, stok, warna));
        }
        System.out.println((type == 'V' ? "Voucher" : "Handphone") + " telah berhasil diinput");
    }
    private void lineBreak(){
        System.out.println("------------------------------");
    }

}
