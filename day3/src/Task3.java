import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println("Enter the divisible");
            double divisible = sc.nextDouble();
            System.out.println("Enter the divisor");
            double divisor = sc.nextDouble();
            if (divisor == 0) {
                System.out.println("Division by 0");
                i++;
                continue;
            }
            double result = divisible / divisor;
            System.out.println(result);

            i++;
        }
    }
}
