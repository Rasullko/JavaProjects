package TaskManager;

import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Task> tasks;
    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    int nextId = 1;
    public int getNextId(){
        int id = nextId;
        nextId++;
        return id;
    }
    public void completeTask(int id){
        for(int i = 0;i<tasks.size();i++){
            Task task = tasks.get(i);
            if(task.getId() == id){
                task.setCompleted();
                return;
            }
        }
    }
    public void removeTask(int id){
        for(int i=0;i<tasks.size();i++){
            Task task = tasks.get(i);
            if(task.getId() == id){
                tasks.remove(task.getId());
            }
        }
    }
    public void showTask(){
        for(int i = 0;i < tasks.size();i++){
            Task task = tasks.get(i);

            System.out.println(task.getId());
            System.out.println(task.getName());
            System.out.println(task.getDescription());
        }
    }
}
