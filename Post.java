import java.util.Scanner;
public class Post {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 100;
        int y = x++;
        System.out.println(y);
        System.out.println(x);
        sc.close();
    }
}