package week6Class;

public class Barang {
    protected int id;
    protected double harga;
    protected String nama;
    protected int stok;

    public Barang(int id, double harga, String nama) {
        this.id = id;
        this.harga = harga;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }
    public void minusStock(int jml){
        this.stok -= jml;
    }
}
