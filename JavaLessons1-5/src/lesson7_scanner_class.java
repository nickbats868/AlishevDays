import java.util.Scanner;
public class lesson7_scanner_class {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println("Вы ввели "+x);

    }
}
