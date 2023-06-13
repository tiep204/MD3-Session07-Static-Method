package ra;

public class Main {
    public static void main(String[] args) {
        double s1 = StaticMethod.calCircleArea(3.5);
        double s2 = StaticMethod.calCircleArea(6);
        System.out.println("Hình tròn có bán kính là 3.5: " + s1);
        System.out.println("Hình tròn có bán kính là 6: " + s2);

        //-	Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
        double t1 = StaticMethod.calTriangleArea(3,4,5);
        double t2 = StaticMethod.calTriangleArea(4.5,7,6);
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        //-	Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
        double r1 = StaticMethod.calRectangleArea(2.5,6);
        double r2 = StaticMethod.calRectangleArea(4,7);
        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);

    }
}