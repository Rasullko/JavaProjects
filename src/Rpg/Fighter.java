package Rpg;

public class Fighter {
    String name;
    int defense;
    int attack;
    int health;
    public int getDefense(){ return this.defense; }
    public int getHealth(){ return this.health; }
    public boolean isAlive(){ return this.health>0; }
    public String getName(){ return this.name; }
    public int getAttack(){ return this.attack;}
    public Fighter(String name, int defense, int attack, int health){
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.health = health;
    }
    public void takeDamage(int damage){
        int actualDamage = damage-(this.defense/2);
        if (actualDamage<0) actualDamage = 0;
        this.health -= actualDamage;
        if(this.health<0) this.health=0;
        System.out.println(this.name + " has taken " + actualDamage + " of damage. His health is now " + health);
    }

}
