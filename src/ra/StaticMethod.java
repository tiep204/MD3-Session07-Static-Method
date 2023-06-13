package ra;

public class StaticMethod {
    public static double PI = 3.14;

    public static double calCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static double calRectangleArea(double with, double height) {
        return with * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        //S = √p x (p – a) x (p – b) x ( p – c)
        //p=(a+b+c)/2
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public StaticMethod() {
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        StaticMethod.PI = PI;
    }
}