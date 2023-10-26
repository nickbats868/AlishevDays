import java.util.Random;


public class Task3 {
    public static void main(String[] args) {

        int[][] ar2dim = new int[12][8];
        Random random = new Random();
        int sum = 0;
        int maxsum = 0;
        int indexOfmaxSumRow = 0;

        for (int r = 0; r < ar2dim.length; r++) {
            for (int c = 0; c < ar2dim[r].length; c++) {
                ar2dim[r][c] = random.nextInt(50);
                System.out.print(ar2dim[r][c] + " ");
                sum += ar2dim[r][c];
            }
            System.out.print("// сумма - ");
            System.out.println(sum);
            if (sum > maxsum) {
                maxsum = sum;
                indexOfmaxSumRow = r;
            }
            sum = 0;
        }
        System.out.print("indexOfmaxSumRow: "+ indexOfmaxSumRow);


    }
}
