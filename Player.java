public class Player{
    private String name;
    private String playerClass;
    private int hp;
    private int level;
    private int phyAtk;
    private int phyDef;
    private int speed;
    private int exp;
    private Equip equip;
    private Area location;
    private Item inventory;

    Player(String name, String playerClass, Area location){
        this.name = name;
        this.playerClass = playerClass;
        this.location = location;
        this.hp = 500;
        this.level;
        this.phyAtk;
        this.phyDef;
        this.speed;
    }

    public void printStats(){
        System.out.println("NAME = " + this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("ATK = " + this.atk);
        System.out.println("DEF = " + this.def);
    }

    public void setStats(){
        if (this.playerClass = "knight"){
            this.hp = 500;
            this.level;
            this.phyAtk;
            this.phyDef;
        }
        else if (this.playerClass = "mage"){
            this.hp = 200;
            this.level;
            this.phyAtk;
            this.phyDef;
        }
        else (this.playerClass = "stray"){
            this.hp = 100;
            this.level;
            this.phyAtk;
            this.phyDef;
        }
    }

    public void levelUp(){
        this.level += 1;

        if (this.level <= 15){
            this.hp = 500;
            this.phyAtk;
            this.phyDef;
            this.speed;
        }
        else if (this.level <= 25){
            this.hp = 200;
            this.phyAtk;
            this.phyDef;
            this.speed;
        }
        else (this.level <= 35){
            this.hp = 100;
            this.phyAtk;
            this.phyDef;
            this.speed;
        }
    }
    
    public int getHealth(){
        return this.hp;
    }

    public int playerAttack(){
        return phyAtk;
    }

    public void takeDamage(int enemyAtk){
        this.hp -= (enemyAtk - phyDef);
    }

    public void movePlayer(Area location){
        this.location = location;
    }

    public void pickUpLoot(Item loot){
        for (int i = 0; i < inventory.length() & inventory[i] != null; i++){
            if (inventory[i] == null){
                inventory[i] = loot;
            }
        }
    }

    public void showInventory(){
        for (int i = 0; i < inventory.length(); i++){
            System.out.println(inventory[i]);
        }
    }

    public void heal(int healingPoints){
        this.hp += healingPoints;
    }
}