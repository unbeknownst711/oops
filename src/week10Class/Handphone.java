package week10Class;

public class Handphone extends Barang {
    private final String warna;
    public static int total = 0;

    public Handphone(String id, double harga, String nama, int stok,String warna) {
        super(id, harga, nama);
        this.stok = stok;
        this.warna = warna;
        total++;
    }

    public String getWarna() {
        return warna;
    }
}
