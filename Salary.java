import java.util.Scanner;

public class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int hours = sc.nextInt();
        int amount = sc.nextInt();

        float salary = hours * amount;

        System.out.println("Employee's id " + str);
        System.out.printf("Salary = Rs. %.2f", salary);

        sc.close();
    }
}