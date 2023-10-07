import java.util.Scanner;

class Launcher{
    public static void main(String[] args){
        
        /* SETUP STRUMENTI DI SISTEMA */
        Scanner console = new Scanner(System.in);

        /* SETUP ASSET */
        /*EnemyLog enemyLog = new EnemyLog();
          ItemList itemList = new ItemList();*/

        /* SETUP MAPPA */
        Map map = new Map();
        Area lastPos = map.undead_asylum;
        map.setPosition(lastPos);
        
        /* CREAZIONE PERSONAGGIO */
        System.out.println("CREAZIONE PERSONAGGIO");
        System.out.println("Scegli un nome per il personaggio: ");
        String name = console.nextLine();
        Player player = new Player(name, lastPos);
        
        /* START GAME */
        boolean playing = true;
        boolean enemyPresent;
        boolean lootPresent;
        char battleChoice;
        char lootChoice;
        char menuChoice;
        Item loot;
        Area nextLocation;

        while (playing){
            System.out.println("POSIZIONE ATTUALE: " + lastPos.getName());
            enemyPresent = lastPos.hasEnemy();

            if (enemyPresent){
                System.out.println("Incontri un nemico. Vuoi lottare? s/n");
                battleChoice = console.next.charAt(0);

                if (battleChoice == 'S' || battleChoice == 's'){
                    enemy = lastPos.getEnemy();
                    Battle battle = new Battle(player, enemy);
                    battle.startBattle();
                }
                else if (battleChoice == 'N' || battleChoice == 'n'){
                    /* implementare fuga */
                }
                else{
                    /*System.out.println("Scelta non valida.");
                    Implementare validazione stretta*/
                }
            }

            lootPresent = lastPos.hasLoot();

            if (lootPresent){
                loot = lastPos.getLoot();
                System.out.println("Hai trovato un " + loot.getName() + ". Vuoi raccoglierlo?");
                System.out.println("s/n");

                lootChoice = console.next.charAt(0);
                if (lootChoice == 'S' || lootChoice == 's'){
                    player.pickUpLoot(loot);
                }
            }

            System.out.println("Che cosa vuoi fare?");
            System.out.println("A) Cerca uscite\n B) Consulta l'inventario\n C) Consulta statistiche\n D) Curati");
            menuChoice = console.next.charAt(0);
            if (menuChoice == 'A' || menuChoice == 'a'){
                boolean exitPresent;
                char direction;

                System.out.println("Dove vuoi andare? n/s/e/w");
                direction = console.next.charAt(0);
                exitPresent = lastPos.hasNeighbors(direction);
                if (exitPresent){
                    System.out.println("Vuoi andare di qua? s/n");
                    char move = console.next.charAt(0);

                    if (move == 'S' || move == 's'){
                        lastPos = lastPos.getNeighbor(direction);
                        player.movePlayer(lastPos);
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
        char a = console.next.charAt(0);

        Battle battle = new Battle(player, enemy);
    }
}