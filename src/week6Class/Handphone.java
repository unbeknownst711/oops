package week6Class;

public class Handphone extends Barang{
    private final String warna;
    public static int total;

    public Handphone(int id, double harga, String nama, int stok,String warna) {
        super(id, harga, nama);
        this.stok = stok;
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}
