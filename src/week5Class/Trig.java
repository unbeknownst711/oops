package week5Class;

public class Trig extends Shape{
    private final double _base;
    private final double _height;

    public Trig(String color, double _base, double _height) {
        super(color);
        this._base = _base;
        this._height = _height;
    }

    public double get_base() {
        return _base;
    }

    public double get_height() {
        return _height;
    }

    public double getArea() {
        return _base * _height / 2;
    }

    public double getPerimeter() {
        return _base + _height + (Math.sqrt(Math.pow(_base,2) + Math.pow(_height, 2)));
    }

    public void out() {
        super.out();
        System.out.printf("%-15s: %f & %f\n%-15s: %f\n%-15s: %f\n","Alas & Tinggi",
                this.get_base(), this.get_height(), "Keliling",this.getPerimeter(),"Luas",this.getArea());
    }
}
