import java.util.Scanner;

public class Shapes {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Radius of circle
        int r = sc.nextInt();

        // Length and width of rectangle
        int l = sc.nextInt();
        int w = sc.nextInt();

        // Base and height of triangle
        int b = sc.nextInt();
        int h = sc.nextInt();

        double areaOfCircle = 3.14159 * r * r;
        double areaOfRectangle = l * w;
        double areaOfTriangle = (b * h) / 2.0;

        System.out.printf("Area of Circle = %.2f\n", areaOfCircle);
        System.out.printf("Area of Rectangle = %.2f\n", areaOfRectangle);
        System.out.printf("Area of Triangle = %.2f\n", areaOfTriangle);

        sc.close();
    }
}