package Basics;

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist2 {
public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
    }
    for(int i=0;i<arr.size()-1;i++){
        for(int j=0; j<arr.size()-1-i;j++) {
            int temp = 0;
            if (arr.get(i) < arr.get(i + 1)) {
                temp = arr.get(i + 1);
                arr.set(i + 1, arr.get(i));
                arr.set(i, temp);
            }
        }

    }
    System.out.println(arr);
}
}
