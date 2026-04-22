package proj1;
import java.util.Scanner;
import java.util.HashMap;
public class PowerScaling {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> arr = new HashMap<>();
        arr.put("Npc", 70);
        arr.put("Obito", 80);
        arr.put("Sasuke", 85);
        arr.put("Madara", 90);
        arr.put("Naruto", 95);
        arr.put("Kaguya", 100);
        System.out.println("Enter your fighter: ");
        String fighter = sc.nextLine();
        int power;
        if(!arr.containsKey(fighter)) {
            System.out.println("Character not found! But you can create your own!");
             power = sc.nextInt();
             sc.nextLine();
             arr.put(fighter, power);
        }
        else{
            power = arr.get(fighter);
        }
        for(HashMap.Entry<String, Integer> i : arr.entrySet()){
            if(i.getValue()< power){
                System.out.println("Your fighter is stronger than " + i.getKey());
            }
            else if(i.getKey().equals( fighter)){
                System.out.println(i.getKey() + " is your fighter. He cannot fight with himself");
            }
            else if(i.getValue() == power){
                System.out.println("Your fighter is as strong as " + i.getKey());
            }

            else{
                System.out.println(i.getKey() + "will beat your fighter.");
            }
        }
    }
}
