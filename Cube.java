import java.util.Scanner;
public class Cube {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        double perimeter = (4*(l+b+h));
        double volume = l*b*h;
        double area = (2*(l*b)+(b*h)+(h*l));
        System.out.println(perimeter);
        System.out.println(volume);
        System.out.println(area);
        sc.close();
    }
}


