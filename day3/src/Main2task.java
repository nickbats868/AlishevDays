//Accept two numbers as input from the user -
// - a divisible and a divisor.
//Calculate the division result and output it to the console.
//The program stops its work
//when the user enters 0 as a divisor.

import java.util.Scanner;

public class Main2task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the divisible");
            double divisible = sc.nextDouble();
            System.out.println("Enter the divisor");
            double divisor = sc.nextDouble();
            if (divisor == 0) {
                System.out.println("error");
                break;
            } else {
                double result = divisible / divisor;
                System.out.println(result);
            }
        }
    }
}
