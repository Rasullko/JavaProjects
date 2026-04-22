package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashmap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> arr = new HashMap<>();

        String s = sc.nextLine();
        String[] text = s.split(" ");
        for(String x: text){
            int cnt = arr.getOrDefault(x, 0);
            arr.put(x, cnt+1);
        }
        for(Map.Entry<String, Integer> entry : arr.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
