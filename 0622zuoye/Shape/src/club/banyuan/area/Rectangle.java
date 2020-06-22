package club.banyuan.area;

public class Rectangle extends Shape{
   private float a;
   private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "长方形";
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2 * (a+b);
    }
}
