import java.util.Scanner;
import static java.lang.Math.*;
public class days_tasks {
    public static void main(String[] args) {


        //task 1 while
        /*
        int value = 0;
        while (value < 10) {
            System.out.print("JAVA ");
            value++;
        }
        */                                  // task1 done


        //task2 for
        /*
        for (int i = 1; i<=10; i++){
            System.out.print("JAVA" +i+" ");
            }
         */                                //task2 done

        //task3 for
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println("JAVA");
        }
        */                                //task3 done

        //task4 while
        /*
        int year = 1980;
        while (year <= 2020){
            System.out.println("Олимпиада " + year +" года");
            year = year + 4;
        }
        */                              //task4 done

        //task5 for
        /*
        for (int year = 1980; year <= 2020; year = year +4) {
            System.out.println("Олимпиада " + year + " года");
        }
        */                              //task5 done

        //task6 while
        /*
        int f_numb = 1;
        int k = 2;
             while (f_numb<=9){
                 int r = f_numb * k;
                  System.out.println(f_numb + " * " + "k" + " = " + r  );
                  f_numb++;
        }
             */                         //task6 done
        //day1 done

        //day2
        //task1 scanner
        /*
    Scanner s = new Scanner(System.in);
    System.out.println("Введите количество этажей:");
    int x = s.nextInt();
    if(x>0&& x<=4){
        System.out.println("Малоэтажный дом");
    } else if(x>4&& x<=8){
        System.out.println("Среднеэтажный дом");
    } else if(x>8){
        System.out.println("Многоэтажный дом");
    } else if(x<=0){
        System.out.println("Ошибка ввода");
    }
             */                         //task1 done

        //task2 for
        /*
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
         */           //task2 done

            //task3 while
//
//        Scanner sa = new Scanner(System.in);
//        int a = sa.nextInt();
//        Scanner sb = new Scanner(System.in);
//        int b = sb.nextInt();
//        int ia = a+1;
//        if(a>=b){
//            System.out.println("Некорректный ввод");
//        }
//        while (ia < b ){
//            if(ia%5 == 0 && ia%10 !=0){
//                System.out.print(ia+" ");
//                ia++;
//            }
//            else if(ia%5 !=0 || ia%10 == 0){
//                ia++;
//                continue;
//            }
                       //task 3 done

        // task4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        if(x >=5){
            double y=(pow(x,2) - 10) / (x + 7);
            System.out.println(y);
        }
        else if(x>-3&&x<5){
            double y=(x+3)*(pow(x,2)-2);
            System.out.println(y);
        }
        else{
            int y = 420;
            System.out.println(y);
        }
        scanner.close();





    }
    }
