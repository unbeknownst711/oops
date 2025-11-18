package week10Class;

public class Order {
    private final String id;
    private final Voucher _voucher;
    private final Handphone _handphone;
    private final int _jumlah;
    public static int total;

    public Order(String id, Voucher _voucher, int _jumlah) {
        this.id = id;
        this._voucher = _voucher;
        this._jumlah = _jumlah;
        this._handphone = null;
    }

    public Order(String id, Handphone _handphone, int _jumlah) {
        this.id = id;
        this._handphone = _handphone;
        this._jumlah = _jumlah;
        this._voucher = null;
    }

    public String getId() {
        return id;
    }

    public Voucher get_voucher() {
        return _voucher;
    }

    public Handphone get_handphone() {
        return _handphone;
    }

    public int get_jumlah() {
        return _jumlah;
    }
}
