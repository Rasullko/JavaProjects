package Rpg;
import java.util.HashMap;
import java.util.Scanner;
public class Roster {
    private HashMap<String, Fighter> list;
    private DBmanager dbService = new DBmanager();
    public Roster(){
       this.list = dbService.loadAll();
    }
    public Fighter getOrCreate(Scanner sc){
        System.out.println("Choose your fighter: ");
        for(HashMap.Entry<String, Fighter> i : list.entrySet()){
            System.out.println(i.getKey());
        }
        System.out.println("Or add your own one");
        String name = sc.nextLine();
        if(list.containsKey(name)){
            System.out.println("You chose " + name);
            return list.get(name);
        }
        System.out.println("It is a new fighter! Put his characteristics here");
        System.out.println("What is his strength: ");
        int atk = sc.nextInt();
        System.out.println("Enter his health: ");
        int health = sc.nextInt();
        System.out.println("Enter his defence: ");
        int defence = sc.nextInt();
        sc.nextLine();
        Fighter newFighter = new Fighter(name, defence, atk, health);
        list.put(name.toLowerCase(), newFighter);
        dbService.saveAll(list);
        return newFighter;

        }
    }

