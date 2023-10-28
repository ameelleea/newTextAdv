public abstract class Entity {

    private String name;
    private int hp;
    private int phyAtk;
    private int phyDef;
    private int speed;
    private boolean isDead;

    Entity(final String name, int hp, int phyAtk, int phyDef, int speed){
        this.name = name;
        this.hp = hp;
        this.phyAtk = phyAtk;
        this.phyDef = phyDef;
        this.speed = speed;
        this.isDead = false;
    }

    /* METODI GETTERS */
    public int getHealth(){
        return this.hp;
    }

    public String getName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getDef(){
        return this.phyDef;
    }

    public boolean hasDied(){
        return this.isDead;
    }

    /* METODI SETTERS */
    public void setHealth(int currentHealth){
        this.hp = currentHealth;
    }

    protected void setStats(){
        this.hp += 10;
        this.phyAtk += 2;
        this.phyDef += 1;
        this.speed += 2;
    }

    public void killOff(){
        this.isDead = true;
    }

    /* BATTLE SYSTEM */
    public int attack(){
        return this.phyAtk;
    }

    public void takeDamage(int enemyAtk){
        this.hp -= (enemyAtk - this.phyDef);
    }
}