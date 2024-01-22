import java.util.HashMap;
import java.util.Random;

public class CodeCheckingFromChatgpt {
    public static void main(String[] args) {

        int[] randomArray = new int[10];
        Random random = new Random();

        for(int i = 0;i<randomArray.length;i++){
            randomArray[i] = random.nextInt(6);
        }

        // Создаем HashMap для хранения чисел и их количества
        HashMap<Integer, Integer> numberCount = new HashMap<>();

        // Проходим по массиву чисел и увеличиваем счетчик для каждого числа в HashMap
        for (int num : randomArray) {
            if (numberCount.containsKey(num)) {
                // Если число уже есть в HashMap, увеличиваем его счетчик на 1
                numberCount.put(num, numberCount.get(num) + 1);
            } else {
                // Если числа еще нет в HashMap, добавляем его и устанавливаем счетчик на 1
                numberCount.put(num, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Выводим результат подсчета
        for (int num : numberCount.keySet()) {
            System.out.println("Число " + num + " встречается " + numberCount.get(num) + " раз(а)");
        }
    }
}
