public class Enemy{
    String name;
    String enemyClass;
    int hp;
    int phyAtk;
    int phyDef;
    int speed;

    Enemy(String name, String enemyClass){
        this.name = name;
        this.enemyClass = enemyClass;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.hp;
    }
    public int enemyAttack(){
        return phyAtk;
    }

    public void takeDamage(int playerAtk){
        this.hp -= (this.playerAtk - this.phyDef);
    }
}