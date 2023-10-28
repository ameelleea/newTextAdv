public class Map{
    /* Istanziare tutte le aree da usare poi nel main */
    private static Enemy enemy = new Enemy("undead", 50, 50, 50, 50, 50);
    public static Item loot, key;
    public static Area[] UndeadAsylumNeighbors = new Area[1];
    public static Area[] FirelinkShrineNeighbors = new Area[2];
    public static Area[] UndeadBurgNeighbors = new Area[1];
    public static Area undead_asylum = new Area("Undead Asylum", false, loot, 1, key, enemy);
    public static Area firelink_shrine = new Area("Firelink Shrine", false, loot, 2, key, enemy);
    public static Area undead_burg = new Area("Undead Burg", false, loot, 1, key, enemy);
    
    public static void setNeighbors(){
    UndeadAsylumNeighbors[0] = firelink_shrine;
    undead_asylum.setNeighbor(UndeadAsylumNeighbors);
    FirelinkShrineNeighbors[0] = undead_burg;
    FirelinkShrineNeighbors[1] = undead_asylum;
    firelink_shrine.setNeighbor(FirelinkShrineNeighbors);
    UndeadBurgNeighbors[0] = firelink_shrine;
    undead_burg.setNeighbor(UndeadBurgNeighbors);
    }
}