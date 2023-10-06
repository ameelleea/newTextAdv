public class Area{

    boolean locked;
    Item loot;
    Area north, south, est, west;
    Mob enemies[];
    Npc entities;

    Area(boolean locked, Item loot, Area north, Area south, Area west, Area est, Mob enemies, Npc entities){
        this.locked = locked;
        this.loot = loot;
        this. north = north;
        this.south = south;
        this.est = est;
        this.west = west;
        this.enemies = enemies;
        this.entities = entities;
    }

    public boolean getAreaState(){
        return locked;
    }

    public Item showAreaLoot(){
        return loot;
    }

    public void onEnterArea(){
        if (this.enemies.length() != 0){
          System.out.println("Incontri " + enemies.length() + "nemici.");
          System.out.println("Vuoi lottare? s/n");  
        }
    }

    public void loadArea(){

    }
}