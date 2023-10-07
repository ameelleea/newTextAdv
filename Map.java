public class Map{
    /* Istanziare tutte le aree da usare poi nel main */
    Area[] UndeadAsylumNeighbors;
    Area undead_asylum = new Area("Undead Asylum", false, null, UndeadAsylumNeighbors, enemyLog.undead);
    private Area currentPosition;

    public Area getPosition(){
        return currentPosition;
    }

    public void setPosition(Area position){
        this.currentPosition = position;
    }

}