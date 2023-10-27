public class Enemy extends Entity{
    private int expBonus;

    /* COSTRUTTORE */
    Enemy(final String name, int hp, final int phyAtk, final int phyDef, final int speed, final int expBonus){
        super(name, hp, phyAtk, phyDef, speed);
        this.expBonus = expBonus;
    }

    public int getExpBonus(){
        return this.expBonus;
    }
}