public class Player{
    private String name;
    private int hp;
    private int level;
    private int phyAtk;
    private int phyDef;
    private int speed;
    private int exp;
    private Area location;
    private Item inventory;
    private boolean isDead;

    /* COSTRUTTORE */
    Player(String name, Area location){
        this.name = name;
        this.location = location;
        this.hp = 500;
        this.level = 1;
        this.phyAtk = 100;
        this.phyDef = 20;
        this.speed = 5;
        this.isDead = false;
    }

    /* METODI GETTERS */
    public void printStats(){
        System.out.println("NAME = " + this.name);
        System.out.println("LEVEL = " + this.level);
        System.out.println("HP = " + this.hp);
        System.out.println("ATK = " + this.phyAtk);
        System.out.println("DEF = " + this.phyDef);
        System.out.println("SPEED = " + this.speed);
        System.out.println("EXP POINTS = " + this.exp);
    }

    public int getHealth(){
        return this.hp;
    }

    public String getName(){
        return this.name;
    }

    public int getExp(){
        return this.exp;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean isDead(){
        return this.isDead;
    }

    /* METODI SETTERS */

    public void levelUp(){
        this.level += 1;
        this.exp = this.exp - 100;
        this.hp += 10;
        this.phyAtk += 2;
        this.phyDef += 1;
        this.speed += 2;
    }
    
    public void incrementExp(int increment){
        this.exp += increment;
    }

    public void setHealth(int currentHealth){
        this.hp = currentHealth;
    }

    public void heal(int healingPoints){
        this.hp += healingPoints;
    }

    public void hasDied(){
        this.isDead = true;
    }

    /* BATTLE SYSTEM */
    public int playerAttack(){
        return this.phyAtk;
    }

    public void takeDamage(int enemyAtk){
        this.hp -= (enemyAtk - this.phyDef);
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