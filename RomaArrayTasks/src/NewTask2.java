// duplicates

import java.util.ArrayList;
import java.util.Scanner;

public class NewTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); //create a dynamic array
        String input;
        do {
            System.out.println("Enter a positive integer (or an empty string to exit): ");
            input = sc.nextLine();
            if (!input.isEmpty()) {
                try {
                    int number = Integer.parseInt(input);
                    if (number <= 0) {
                        System.out.println("incorrect input.the entered number is less than or equal to zero");
                        continue;
                    }
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("incorrect input. enter a positive integer: ");
                    continue;
                }
            }
        } while (!input.isEmpty());
        System.out.println("Positive integers entered: " + numbers);

        int duplicates = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (numbers.get(i) == numbers.get(j)) {
                    duplicates += 1;
                }
            }
        }
        if (duplicates == 0) {
            System.out.println("Result: false");
            System.out.println("There are no duplicates");
        } else {
            System.out.println("Result: true " );
            System.out.println("Дубликаты есть но ты пока слишком тупой чтобы" +
                    " написать метод который их посчитает =(" );

        }


    }
}
