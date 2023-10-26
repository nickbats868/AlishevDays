
import java.util.Scanner;

public class Lesson11_Arrays {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных
        int[] numbers = new int[5]; //numbers ->[массив]
        //^Ссылочный тип данных^
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[1]);
        }
    }
}

