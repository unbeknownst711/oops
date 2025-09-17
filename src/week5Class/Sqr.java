package week5Class;

public class Sqr extends Shape {
    private final double _side;

    public Sqr(String color, double _side) {
        super(color);
        this._side = _side;
    }

    public double get_side() {
        return _side;
    }

    public double getArea() {
        return _side * _side;
    }

    public double getPerimeter() {
        return 4 * _side;
    }

    public void out() {
        super.out();
        System.out.printf("%-10s: %f\n%-10s: %f\n%-10s: %f\n","Sisi",
                this.get_side(), "Keliling",this.getPerimeter(),"Luas",this.getArea());
    }
}
