public class Player{
    private String name;
    private String playerClass;
    private int hp;
    private int level;
    private int phyAtk;
    private int phyDef;
    private int magAtk;
    private int magDef;
    private int speed;
    private Equip equip[];
    private Area location;
    private Item inventory[];

    Player(String name, String playerClass, Area location){
        this.name = name;
        this.playerClass = playerClass;
        this.location = location;
    }

    public void getStats(){
        System.out.println("NAME = " + this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("ATK = " + this.atk);
        System.out.println("DEF = " + this.def);
    }

    public void setStats(){
        if (this.playerClass = "knight"){
            this.hp = 500;
            this.stamina;
            this.level;
            this.phyAtk;
            this.phyDef;
            this.magAtk;
            this.magDef;
        }
        else if (this.playerClass = "mage"){
            this.hp = 200;
            this.stamina;
            this.level;
            this.phyAtk;
            this.phyDef;
            this.magAtk;
            this.magDef;
        }
        else (this.playerClass = "stray"){
            this.hp = 100;
            this.stamina;
            this.level;
            this.phyAtk;
            this.phyDef;
            this.magAtk;
            this.magDef;
        }
    }

    public int playerAttack(String type){
        int atk;
        if (type == "physical"){
            atk = phyAtk;
        }
        else{
            atk = magAtk;
        }

        return atk;
    }

    public void takeDamage(int enemyAtk, String type){
        if (type == "physical"){
        this.hp -= (enemyAtk - phyDefdef);
        }
        else{
            this.hp -= (enemyAtk - magDefdef);
        }
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