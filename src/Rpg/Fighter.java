package Rpg;
import java.util.Random;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fighter {
    private String name;
    private int defense;
    private int attack;
    private int health;
    private int speed;
    Random dodge = new Random();
    public int getDefense(){ return this.defense; }
    public int getHealth(){ return this.health; }
    public boolean isAlive(){ return this.health>0; }
    public String getName(){ return this.name; }
    public int getAttack(){ return this.attack; }
    public int getSpeed(){ return this.speed; }
    public Fighter(String name, int defense, int attack, int health, int speed){
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.health = health;
        this.speed = speed;
    }
    public Fighter(){};
    public void sleep(int ms){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public void takeDamage(int damage) {
        int actualDamage = damage - (this.defense / 2);
        int dodgeAttack = dodge.nextInt(10);
        dodgeAttack *= speed;
        if (actualDamage < 0 || dodgeAttack >= 50) actualDamage = 0;
        this.health -= actualDamage;
        if (this.health < 0) this.health = 0;
        if (actualDamage == 0) {
            System.out.println(this.name + " has taken no damage from attack. His health is still " + this.health);
            sleep(1000);
        } else {
            System.out.println(this.name + " has taken " + actualDamage + " of damage. His health is now " + health);
            sleep(1000);
        }
    }

}
