package Basics;

import java.util.Scanner;

class Cars{
    String name;
    int speed;
    Cars(String name, int speed){
        this.name=name;
        this.speed=speed;
    }
}
public class easytasks{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        int speed = sc.nextInt();
        Cars car1 = new Cars(name,speed);
        Cars car2 = new Cars(name, speed);
        System.out.println(car1.name +" can go " + car1.speed + "km/h");
        System.out.println(car2.name +" can go " + car2.speed + "km/h");
    }
}