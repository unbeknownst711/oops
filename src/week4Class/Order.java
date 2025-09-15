package week4Class;

public class Order {
    private final int _id;
    private final int _jumlah;
    private final Barang _barang;
    public static int total;

    public Order(int _id, int _jumlah, Barang _barang) {
        this._id = _id;
        this._jumlah = _jumlah;
        this._barang = _barang;
    }

    public int get_id() {
        return _id;
    }

    public int get_jumlah() {
        return _jumlah;
    }

    public Barang get_barang() {
        return _barang;
    }
}
