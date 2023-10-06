public class Battle{
    Player player;
    Enemy enemy;
    int playerAtk;
    int enemyAtk;

    Battle(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void startBattle(){
        while (player.getHealth() != 0 && enemy.getHealth() != 0){
            if (player.getSpeed() < enemy.getSpeed()){
                enemy.enemyAttack();
            }
        }
    }

    
}