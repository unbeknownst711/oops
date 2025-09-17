package week5Class;

public class Rect extends Shape{
    private final double len, wide;

    public Rect(String color, double len, double wide) {
        super(color);
        this.len = len;
        this.wide = wide;
    }

    public double getLen() {
        return len;
    }

    public double getWide() {
        return wide;
    }

    public double getArea() {
        return len * wide;
    }

    public double getPerimeter() {
        return 2 * (len + wide);
    }

    public void out() {
        super.out();
        System.out.printf("%-15s: %f & %f\n%-15s: %f\n%-15s: %f\n","Panjang & Lebar",
                this.getLen(), this.getWide(), "Keliling",this.getPerimeter(),"Luas",this.getArea());
    }
}
