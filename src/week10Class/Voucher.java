package week10Class;

public class Voucher extends Barang {
    private final double pajak;
    public static int total = 0;

    public Voucher(String id, double harga, String nama, int stok, double pajak) {
        super(id, harga, nama);
        this.stok = stok;
        this.pajak = pajak;
        total++;
    }

    public double getPajak() {
        return pajak;
    }
    public double getHargaJual(){
        return harga * (1 + getPajak());
    }
}
