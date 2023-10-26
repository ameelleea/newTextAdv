public class Enemy{
    private String name;
    private int hp;
    private int phyAtk;
    private int phyDef;
    private int speed;
    private int expBonus;

    /* COSTRUTTORE */
    Enemy(String name, int hp, int phyAtk, int phyDef, int speed, int expBonus){
        this.name = name;
        this.hp = hp;
        this.phyAtk = phyAtk;
        this.phyDef = phyDef;
        this.speed = speed;
        this.expBonus = expBonus;
    }

    /* METODI GETTERS */
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.hp;
    }

    public int getExpBonus(){
        return this.expBonus;
    }

    public int getSpeed(){
        return this.speed;
    } 

    /* BATTLE SYSTEM */
    public int enemyAttack(){
        return this.phyAtk;
    }

    public void takeDamage(int playerAtk){
        this.hp -= (playerAtk - this.phyDef);
    }
}