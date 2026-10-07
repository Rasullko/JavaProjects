package TaskManager;

import java.util.Scanner;

public class TaskApp {
    private Scanner sc;
    private TaskManager manager;
    public TaskApp(){
        sc = new Scanner(System.in);
        manager = new TaskManager();
    }
    public void start(){
            while(true) {
                System.out.println("====TASK MANAGER=====");
                System.out.println("Choose your option:");
                System.out.println("1. Add task");
                System.out.println("2. Show tasks");
                System.out.println("3. Complete task");
                System.out.println("4. Remove task");
                System.out.println("5. Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        addTasks();
                        break;
                    case 2:
                        manager.showTask();
                        break;
                    case 3:
                        completeTasks();
                        break;
                    case 4:
                        removeTasks();
                        break;
                    case 5:
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("Invalid option");
                }
        }
        }
        private void addTasks(){
        System.out.println("Enter the title of the task:");
        String title = sc.nextLine();
        System.out.println("Enter the description of the task");
        String description = sc.nextLine();
        int id = manager.getNextId();
        Task task = new Task(id, title,description);
        manager.addTask(task);
        }
        private void completeTasks(){
        System.out.println("Which task you want to complete?(enter id): ");
        manager.showTask();
        int id = sc.nextInt();
        manager.completeTask(id);
        }
        private void removeTasks(){
        System.out.println("Which task you want to remove?(enter id):");
        int id = sc.nextInt();
        manager.removeTask(id);
        }
}
