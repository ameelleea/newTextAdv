public class Equip extends Item {
    private final int phyAtkBonus;
    private final int magAtkBonus;
    private final int phyDefBonus;
    private final int magDefBonus;
    private final int speedBonus;

    Equip(String name, String type, int phyAtkBonus, int magAtkBonus, int phyDefBonus, int magDefBonus, int speedBonus){
        super(name, type);
        this.phyAtkBonus = phyAtkBonus;
        this.magAtkBonus = magAtkBonus;
        this.phyDefBonus = phyDefBonus;
        this.magDefBonus = magDefBonus;
        this.speedBonus = speedBonus;
    }
}