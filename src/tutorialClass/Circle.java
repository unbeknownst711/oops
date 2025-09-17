package tutorialClass;

public class Circle extends Shape{
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
}
