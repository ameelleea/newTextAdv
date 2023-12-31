import java.util.Scanner;

public class Battle{
    
    /* Todo: implement coherent atk and def stats and add more messages to user */
    public static void startBattle(Player player, Enemy enemy){
        Scanner console = new Scanner(System.in);
        System.out.println("Hai incontrato " + enemy.getName());
        System.out.println("INIZIO BATTAGLIA");
        while (player.getHealth() > 0 && enemy.getHealth() > 0){
            char playerChoice;


            System.out.println("Attacco player: " + player.attack() + "\nAttacco nemico: " + enemy.attack());

            System.out.println("Cosa vuoi fare?");
            System.out.println("A) Attaccare B) Curarti");
            playerChoice = console.next().charAt(0);

            if (playerChoice == 'A' || playerChoice == 'a'){
                if (player.getSpeed() < enemy.getSpeed()){
                    System.out.println(enemy.getName() + " attacca per primo.");
                    player.takeDamage(enemy.attack());
                    enemy.takeDamage(player.attack());
                }
                else{
                    System.out.println(player.getName() + " attacca per primo.");
                    enemy.takeDamage(player.attack());
                    player.takeDamage(enemy.attack());
                }
            }
            else if (playerChoice == 'B' || playerChoice == 'b'){
                player.heal(100);
            }

            System.out.println("Salute rimasta:");
            System.out.println(player.getName() + ": " + player.getHealth());
            System.out.println(enemy.getName() + ": " + enemy.getHealth());
        }

        if (player.getHealth() <= 0){
            System.out.println("SEI MORTO.");
            player.hasDied();
        }
        else if (enemy.getHealth() <= 0){
            System.out.println("HAI VINTO");
            System.out.println("Ottieni " + enemy.getExpBonus() + " punti esperienza.");
            player.incrementExp(enemy.getExpBonus());

            if (player.getExp() >= 100){
                System.out.println("Sei salito di livello!");
                player.levelUp();
            }
        }
    }
}