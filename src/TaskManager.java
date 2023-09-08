import java.util.ArrayList;
import java.util.List;

public class TaskManager {
   private  List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removetask(String taskName){
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    public void listTasks(){
        for(var task: tasks)
            System.out.println(task);
    }

    public void filterByPriority(Priority priority){
        tasks.stream()
                .filter(p -> p.getPriority() == priority)
                .forEach(System.out::println);
    }
}
