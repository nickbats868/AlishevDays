import java.util.Scanner;

// вывод названия страны, принимая на вход название города.
// должна работать до тех пор, пока не будет введено слово “Stop”.
public class Main1task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите город: ");
        String town;
        do {
            town = sc.nextLine();
            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        } while (!town.equals("Stop"));
    }
}