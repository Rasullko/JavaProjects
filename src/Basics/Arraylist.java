package Basics;

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Rasul");
        students.add("berserk");
        students.add("messi");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        students.remove(1);
        System.out.println(students);
        System.out.println(students.size());
    }
}