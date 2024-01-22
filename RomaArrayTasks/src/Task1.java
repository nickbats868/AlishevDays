import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 15, 17}; // an array of integers
        String arrayString = Arrays.toString(array);
        System.out.println("An array is given: " + arrayString);

        Scanner scanner = new Scanner(System.in); //
        System.out.println("Enter a number in the array: ");
        int entNum = scanner.nextInt();
        for (int i = 0; i < array.length;i++ ){
            for (int k = 1; k < array.length; k++) {
                if(i ==k){
                    continue;
                }
                int elSum = array[i] + array[k];
                if (elSum == entNum) {
                    System.out.println("Индексы элементов: " + i + ", " + k);
                    return;
                }
            }
        }
                                            // цикл для вычисления и сравнения суммы трёх элементов и так далее
    }
}