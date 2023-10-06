public class Equip{
    String type;
    String description;
    int phyAtkBonus;
    int magAtkBonus;
    int phyDefBonus;
    int magDefBonus;
    int speedBonus;

    Equip(String type, String description, int phyAtkBonus, int magAtkBonus, int phyDefBonus, int magDefBonus, int speedBonus){
        this.type = type;
        this.description = type;
        this.phyAtkBonus = phyAtkBonus;
        this.magAtkBonus = magAtkBonus;
        this.phyDefBonus = phyDefBonus;
        this.magDefBonus = magDefBonus;
        this.speedBonus = speedBonus;
    }
}