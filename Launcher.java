import java.util.Scanner;

public class Launcher{
    public static void main(String[] args){
        
        /* SETUP STRUMENTI DI SISTEMA */
        Scanner console = new Scanner(System.in);

        /* SETUP ASSET */
        /*EnemyLog enemyLog = new EnemyLog();
          ItemList itemList = new ItemList();*/

        /* SETUP MAPPA */
        Map.setNeighbors();
        Area lastPos, currentPos;
        lastPos = currentPos = Map.undead_asylum;
        
        /* CREAZIONE PERSONAGGIO */
        System.out.println("CREAZIONE PERSONAGGIO");
        System.out.println("Scegli un nome per il personaggio: ");
        String name = console.nextLine();
        Player player = new Player(name, currentPos);
        
        /* START GAME */
        boolean playing = true;
        char lootChoice;
        char menuChoice;
        Item loot;
        Area nextLocation;
        boolean inArea = true;

        while (playing){
            System.out.println("POSIZIONE ATTUALE: " + currentPos.getName());
            
            if (currentPos.hasEnemy()){                
                Battle battle = new Battle(player, currentPos.getEnemy());
                battle.startBattle();
            }

            if (currentPos.hasLoot()){
                loot = currentPos.getLoot();
                /*System.out.println("Hai trovato un " + loot.getName() + ". Vuoi raccoglierlo?");*/
                System.out.println("s/n");

                lootChoice = console.next().charAt(0);
                if (lootChoice == 'S' || lootChoice == 's'){
                    player.pickUpLoot(loot);
                    /*System.out.println("Hai raccolto " + loot.getName());*/
                }
            }

            while (inArea){
                System.out.println("Che cosa vuoi fare?");
                System.out.println("A) Cerca uscite\n B) Consulta l'inventario\n C) Consulta statistiche\n D) Curati");
                menuChoice = console.next().charAt(0);
                if (menuChoice == 'A' || menuChoice == 'a'){
                    boolean exitPresent;
                    char direction;

                    System.out.println("Dove vuoi andare? n/s/e/w");
                    direction = console.next().charAt(0);
                    exitPresent = currentPos.hasNeighbors(direction);
                    if (exitPresent){
                        System.out.println("Vuoi andare di qua? s/n");
                        char move = console.next().charAt(0);

                        if (move == 'S' || move == 's'){
                            lastPos = currentPos;
                            currentPos = currentPos.getNeighbor(direction);
                            player.movePlayer(currentPos);
                            inArea = false;
                        }
                    }
                }
                else if (menuChoice == 'B' || menuChoice == 'b'){
                    player.showInventory();
                }
                else if (menuChoice == 'C' || menuChoice == 'c'){
                    player.printStats();
                }
                else if (menuChoice == 'D' || menuChoice == 'd'){
                    /* Send help */
                }
                else{
                    /*System.out.println("Scelta non valida.");
                        Implementare validazione stretta*/
                }
            }
        }
    }
}