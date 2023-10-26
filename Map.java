public class Map{
    /* Istanziare tutte le aree da usare poi nel main */
    private static Enemy enemy = new Enemy("undead", 50, 50, 50, 50, 50);
    public static Item loot, key;
    public static Area[] UndeadAsylumNeighbors;
    public static Area[] FirelinkShrineNeighbors;
    public static Area[] UndeadBurgNeighbors;
    public static Area undead_asylum = new Area("Undead Asylum", false, loot, key, UndeadAsylumNeighbors, enemy);
    public static Area firelink_shrine = new Area("Firelink Shrine", false, loot, key, FirelinkShrineNeighbors, enemy);
    public static Area undead_burg = new Area("Undead Burg", false, loot, key, UndeadBurgNeighbors, enemy);
    
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