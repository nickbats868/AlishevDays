
// the number n is entered from the keyboard
// - the size of the array
// С клавиатуры вводится число n - размер массива. Необходимо создать массив
//        указанного размера и заполнить его случайными числами от 0 до 10 Затем
//        вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//        Пример:
//        Введено число 10 Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Введено число " + n + ". Сгенерирован следующий массив: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);

        int morethan8 = 0;
        for (int m = 0; m < array.length; m++) {
            if (array[m] > 8) {
                morethan8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + morethan8);

        int equalto1 = 0;
        for (int e = 0; e < array.length; e++) {
            if (array[e] == 1) {
                equalto1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + equalto1);

        int evennumbs = 0;
        for (int ev = 0; ev < array.length; ev++) {
            if (array[ev] % 2 == 0) {
                evennumbs++;
            }
        }
        System.out.println("Количество чётных чисел: " + evennumbs);

        int oddnumbs = 0;
        for (int od = 0; od < array.length; od++) {
            if (array[od] % 2 != 0) {
                oddnumbs++;
            }
        }
        System.out.println("Количество нечётных чисел: " + oddnumbs);

            int sum = 0;
            for(int su = 0;su<array.length;su++){
                sum = sum + array[su];
            }
            System.out.println("Sum of all array elements: " + sum);
        }
    }
