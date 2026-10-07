package TaskManager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("====TASK MANAGER=====");
            System.out.println("Choose your option:");
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Remove task");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
        }

    }
}
