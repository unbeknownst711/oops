package week5Class;

public class Shape {
    private final String _color;

    public Shape(String color) {
        this._color = color;
    }

    public String get_color() {
        return _color;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public void out(){
        System.out.println("Warna: " + this.get_color());
    }
}
