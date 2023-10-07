public class Area{

    private String name;
    private boolean locked;
    private Item unlockingKey;
    private Item loot;
    private Area[] neighbors;
    private Enemy enemies;

    /* COSTRUTTORE */
    Area(String name, boolean locked, Item unlockingKey, Item loot, Area[] neighbors, Enemy enemies){
        this.name = name;
        this.locked = locked;
        this.unlockingKey = unlockingKey;
        this.loot = loot;
        this.neighbors = neighbors;
        this.enemies = enemies;
    }

    /* METODI */
    public boolean isLocked(){
        return locked;
    }

    public void unlockArea(Item key){
        if (key == this.unlockingKey && this.locked){
            this.locked = false;
        }
    }
    
    public boolean hasLoot(){
        boolean hasLoot;
        if (this.loot != null){
            hasLoot = true; 
        }
        else{
            hasLoot = false;
        }

        return hasLoot;
    }

    public Item getLoot(){
        return loot;
    }

    public boolean hasEnemy(){
        boolean hasEnemy;
        if (this.enemies != null){
          hasEnemy = true;
        }
        else{
            hasEnemy = false;
        }
    }

    public Enemy getEnemy(){
        return enemy;
    }

    public boolean hasNeighbors(char direction){
        boolean hasNeighbors;

        if (direction == "n"){
            if (this.neighbors[0] != null){
                System.out.println("A nord c'è un'uscita.");
                hasNeighbors = true;
            }
            else{
                System.out.println("A nord la strada è chiusa.");
                hasNeighbors = false;
            }
        }
        else if (direction == "s"){
            if (this.neighbors[1] != null){
                System.out.println("A sud c'è un'uscita.");
                hasNeighbors = true;
            }
            else{
                System.out.println("A sud la strada è chiusa.");
                hasNeighbors = false;
            }
        }
        else if (direction == "w"){
            if (this.neighbors[2] != null){
                System.out.println("A ovest c'è un'uscita.");
                hasNeighbors = true;
            }
            else{
                System.out.println("A ovest la strada è chiusa.");
                hasNeighbors = false;
            }
        }
        else if (direction == "e"){
            if (this.neighbors[3] != null){
                System.out.println("A est c'è un'uscita.");
                hasNeighbors = true;
            }
            else{
                System.out.println("A est la strada è chiusa.");
                hasNeighbors = false;
            }
        }
        
        return hasNeighbors;
    }

    public Area getNeighbor(char direction){
        Area neighbor;

        if (direction == "n"){
            neighbor = this.neighbors[0];
        }
        else if (direction == "s"){
            neighbor = this.neighbors[1];
        }
        else if (direction == "w"){
            neighbor = this.neighbors[2];
        }
        else if (direction == "e"){
            neighbor = this.neighbors[3];
        }
        
        return hasNeighbors;
    }
}