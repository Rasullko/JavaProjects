package Basics;

import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> arr = new HashMap<>();
        arr.put("Rasul", 111);
        arr.put("Nurda", 85);
        arr.put("Nuris", 83);
        arr.put("Makas", 44);

        for(HashMap.Entry<String, Integer> i : arr.entrySet()){
            if(i.getValue()>50){
                System.out.println(i.getKey() + " : "+ i.getValue());
            }
        }
    }
}
