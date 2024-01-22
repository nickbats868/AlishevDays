package day7;

public class TaskN2 {
    public static void main(String[] args) {
        Player.info();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player.info();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        Player player8 = new Player();
        Player.info();

        System.out.println("Player 1 stamina is: " + player1.getStamina());
        player1.run(player1);
        while (player1.getStamina() > 0) {
            player1.run(player1);
        }
        player1.run(player1);
        Player.info();

    }
}
