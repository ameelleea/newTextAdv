public class Map{
    /* Istanziare tutte le aree da usare poi nel main */
    Enemy enemy = new Enemy("undead", 50, 50, 50, 50, 50);
    Item loot, key;
    Area[] UndeadAsylumNeighbors;
    public Area undead_asylum = new Area("Undead Asylum", false, loot, key, UndeadAsylumNeighbors, enemy);
    private Area currentPosition;

    public Area getPosition(){
        return currentPosition;
    }

    public void setPosition(Area position){
        this.currentPosition = position;
    }

}