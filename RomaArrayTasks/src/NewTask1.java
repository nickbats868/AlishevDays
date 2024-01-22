import java.util.Scanner;
import java.util.ArrayList;

public class NewTask1 {
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

        System.out.println("positive integers entered: " + numbers);
        System.out.println("Enter the value of TARGET: ");

        int target = 0;
        try {
             target = Integer.parseInt(sc.nextLine());

        }catch (NumberFormatException e){
            System.out.println("incorrect input. try again: ");
        }

        int elsum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(i == j){
                    continue;
                }
                 elsum = numbers.get(i) + numbers.get(j);
                if (elsum == target){
                    System.out.println("positive integers entered: " + numbers);
                    System.out.println("Value TARGET: "+ target);
                    System.out.println("Output: " +"["+i+","+j+"]");
                    return;
                }
            }
        }
        if (elsum != target){
            System.out.println("positive integers entered: " + numbers);
            System.out.println("Value TARGET: "+ target);
            System.out.println("Output: " +"["+-1+","+-1+"]");
        }
    }

}