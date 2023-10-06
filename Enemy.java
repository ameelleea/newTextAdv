public class Enemy{
    String name;
    String enemyClass;
    int phyAtk;
    int phyDef;
    int magAtk;
    int magDef;

    Enemy(String name, String enemyClass){
        this.name = name;
        this.enemyClass = enemyClass;
    }

    public String getName(){
        return this.name;
    }

    public String getEnemyClass(){
        return this.enemyClass;
    }
    
    public int enemyAttack(String type){
        int atk;
        if (type == "physical"){
            atk = this.phyAtk;
        }
        else{
            atk = this.magAtk;
        }

        return atk;
    }

    public void takeDamage(int enemyAtk, String type){
        if (type == "physical"){
        this.hp -= (this.enemyAtk - this.phyDefdef);
        }
        else{
            this.hp -= (this.enemyAtk - this.magDefdef);
        }
    }
}