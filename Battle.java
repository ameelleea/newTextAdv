import java.util.Scanner;

public class Battle{
    Player player;
    Enemy enemy;

    Battle(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void startBattle(){
        Scanner console = new Scanner(System.in);

        while (player.getHealth() != 0 && enemy.getHealth() != 0){
            char playerChoice;

            System.out.println("Cosa vuoi fare?");
            System.out.println("A) Attaccare B) Curarti");
            playerChoice = console.next().charAt(0);

            if (playerChoice == 'A' || playerChoice == 'a'){
                if (player.getSpeed() < enemy.getSpeed()){
                    player.takeDamage(enemy.enemyAttack());
                }
                else{
                    enemy.takeDamage(player.playerAttack());
                }
            }
            else if (playerChoice == 'B' || playerChoice == 'b'){
                player.heal(100);
            }

            System.out.println("Salute rimasta:");
            System.out.println("Giocatore: " + player.getHealth());
            System.out.println("Avversario: " + enemy.getHealth());
        }

        if (player.getHealth() == 0){
            player.hasDied();
        }
        else if (enemy.getHealth() == 0){
            player.incrementExp(enemy.getExpBonus());

            if (player.getExp() >= 100){
                player.levelUp();
            }
        }
        /* Implement expIncrement and death mechanics */
    }

    
}