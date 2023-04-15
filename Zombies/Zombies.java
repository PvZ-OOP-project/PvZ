package Zombies;

public class Zombies {
    private int zombieSpeed;
    private int zombieHealth;
    private int xCoordinate;
    private int yCoordinate;
    protected static boolean gameOver = false;
    protected static int zombieCount = 0;

    public Zombies(int zombieSpeed,int zombieHealth,int xCoordinate,int yCoordinate){
        this.zombieSpeed = zombieSpeed;
        this.zombieHealth = zombieHealth;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        zombieCount++;
    }

    public void setZombieSpeed(int x){
        this.zombieSpeed = x;
    }

    public void setZombieHealth(int x){
        this.zombieHealth = x;
    }

    public void setXCoordinate(int x){
        this.xCoordinate = x;
    }

    public void setYCoordinate(int x){
        this.yCoordinate = x;
    }

    public void zombieHit(){

    }

    public void checkGameOver(){
        
    }


}
