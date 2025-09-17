package week5Class;

public class Circle extends Shape {
    private final double _radius;

    public Circle(String color, double _radius) {
        super(color);
        this._radius = _radius;
    }

    public double get_radius() {
        return _radius;
    }

    public double getArea() {
        return Math.PI * _radius * _radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * _radius;
    }

    public void out() {
        super.out();
        System.out.printf("%-10s: %f\n%-10s: %f\n%-10s: %f\n","Sisi",
                this.get_radius(), "Keliling",this.getPerimeter(),"Luas",this.getArea());
    }
}
