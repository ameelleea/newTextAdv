public class Player extends Entity{
    
    private int level;
    private int exp;
    private Area location;
    private Item inventory;

    /* COSTRUTTORE */
    Player(final String name, int hp, int phyAtk, int phyDef, int speed, Area location){
        super(name, hp, phyAtk, phyDef, speed);
        this.location = location;
        this.level = 1;
    }

    /* METODI GETTERS */
    public int getExp(){
        return this.exp;
    }

    public void printStats(){
        System.out.println("NAME = " + super.getName());
        System.out.println("LEVEL = " + this.level);
        System.out.println("HP = " + super.getHealth());
        System.out.println("ATK = " + super.attack());
        System.out.println("DEF = " + super.getDef());
        System.out.println("SPEED = " + super.getSpeed());
    }

    /* METODI SETTERS */

    public void levelUp(){
        this.level += 1;
        this.exp = this.exp - 100;
        super.setStats();
    }
    
    public void incrementExp(int increment){
        this.exp += increment;
    }

    public void heal(int healingPoints){
        super.setHealth(healingPoints);
    }

    public void movePlayer(Area location){
        this.location = location;
    }

    public void pickUpLoot(Item loot){
        /*for (int i = 0; i < inventory.length() & inventory[i] != null; i++){
            if (inventory[i] == null){
                inventory[i] = loot;
            }
        }*/
    }

    public void showInventory(){
       /* for (int i = 0; i < inventory.length(); i++){
            System.out.println(inventory[i]);
        }*/
    }
}