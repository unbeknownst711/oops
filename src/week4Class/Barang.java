package week4Class;

public class Barang {
    private final int _id;
    private int _stock;
    private final int _harga;
    private final String _nama;

    public Barang(int _id, int _stock, int _harga, String _nama) {
        this._id = _id;
        this._stock = _stock;
        this._harga = _harga;
        this._nama = _nama;
    }

    public int get_id() {
        return _id;
    }

    public int get_stock() {
        return _stock;
    }

    public int get_harga() {
        return _harga;
    }

    public String get_nama() {
        return _nama;
    }

    public void minusQty(int qty){
        this._stock -= qty;
    }
}
