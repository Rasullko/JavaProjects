package Rpg;
import java.util.Scanner;
import java.util.List;
public class main {
    public static void main(String args[]) {
        Roster roster = new Roster();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the first fighter: ");
        Fighter fighter1 = roster.getOrCreate(sc);
        System.out.println("Choose the second fighter: ");
        Fighter fighter2 = roster.getOrCreate(sc);
        System.out.println("FIGHT!");
        while(fighter1.isAlive() && fighter2.isAlive()){
            fighter2.takeDamage(fighter1.getAttack());
            if(!fighter2.isAlive()){
                break;
            }
            fighter1.takeDamage(fighter2.getAttack());
        }
        if(fighter1.isAlive()){
            System.out.println(fighter1.getName() + " won!");
        }
        else{
            System.out.println(fighter2.getName() + " won!");
        }
    }
}
