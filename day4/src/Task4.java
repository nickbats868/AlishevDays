import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.println(array[i]);
        }

        System.out.println();
        System.out.println();

        int maxsum = 0;
        int indFirstElOfTheTriple = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int n0 = array[i];
            int n1 = array[i + 1];
            int n2 = array[i + 2];
            int sum = n0 + n1 + n2;
            System.out.println(i);
            System.out.println("sum = " + sum);
            if (sum >= maxsum) {
                maxsum = sum;
                indFirstElOfTheTriple = i;
            }
            System.out.println("maxsum = " + maxsum);
            System.out.println("first el of the triple: " + indFirstElOfTheTriple);
            System.out.println();
        }
        System.out.println(maxsum);
        System.out.println(indFirstElOfTheTriple);
    }
}