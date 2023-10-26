import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int largest = array[0];
        for (int l : array) {
            if (l > largest) {
                largest = l;
            }
        }
        System.out.println("The largest element of the array: " + largest);

        int smallest = array[0];
        for (int s : array) {
            if (s < smallest) {
                smallest = s;
            }
        }
        System.out.println("The smallest element of the array: " + smallest);

        int quantend0 = 0;
        for (int q : array) {
            if (q % 10 == 0) {
                quantend0++;
            }
        }
        System.out.println("The quantity of elements ending in 0: " + quantend0);

        int sumEnd0 = 0;
        for (int s:array){
            if (s %10 == 0){
                sumEnd0 = sumEnd0 + s;
            }
        }
        System.out.println("The sum of elements ending in 0: " + sumEnd0);

    }

}
