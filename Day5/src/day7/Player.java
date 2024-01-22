package day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    private static final int minStartStamina = 90;
    private static final int maxStartStamina = 100;
    private static final int diff = maxStartStamina - minStartStamina;

    private static int instanceCount = 0;/* использование приватной статической
    переменной -счётчика, для подсчёта количества созданных
    экземпляров класса -(объектов((игроков)).
    Её реализация - при создании первого объекта через конструктор -
    значение переменной увеличивается с 0 на 1 и так далее.*/
    private static final int MAX_INSTANCE_COUNT = 6;

    public Player() {                     //конструктор
        if (instanceCount < MAX_INSTANCE_COUNT) {
            instanceCount++;
            Random random = new Random();
            int initialStamina = random.nextInt(diff + 1);
            initialStamina += minStartStamina;
            stamina = initialStamina;
            System.out.print("Player " + instanceCount + ".");
            System.out.println(" Initial stamina: " + getStamina());
        } else {
            System.out.println("There are no available places for new players");
        }
    }

    public static void  info() { //TODO: 2 task
        if (instanceCount < 6) {
            int availablePlace = 6 - instanceCount;
            System.out.println("The teams are not completed. The are still " + availablePlace + " empty seats.");
        } else {
            System.out.println("The number of players on the field: " + 6 + ". There are no empty seats on the field\n");
        }
        //TODO: 3 task -  Make the logic of leaving the field when the player is tired - DONE
    }

    public int getStamina() { //гет-метод для получения поля "выносливость"
        return stamina;
    }

    public void run(Player player) { //TODO: 1 task DONE(kind of)
        if (stamina > 0) {
            player.stamina--;
            System.out.println("player is runnung...");
            System.out.println("Player's current stamina is: " + stamina);
        } else {
            System.out.println("Player's stamina is 0. Player needs a rest." +
                    "The player left the field.");
            instanceCount--;
            System.out.println("Players on the field: " + instanceCount);
        }
    }


}
