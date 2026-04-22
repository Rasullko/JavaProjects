package Basics;

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistsame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            arr2.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr.get(i).equals(arr2.get(j))){
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
