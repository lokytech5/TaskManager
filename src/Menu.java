import java.util.Scanner;

public class Menu {
    private TaskManager taskManager;
    private Scanner input;

    public Menu(TaskManager taskManager) {
        this.taskManager = taskManager;
        this.input = new Scanner(System.in);
    }

    public void displayMenu(){
        while(true){
            showOptions();
            handleuserInput();
        }
    }

    private void showOptions() {
        System.out.println("\n Task Manager Menu: ");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Filter Tasks by Priority");
        System.out.println("5. Exit");
    }

    public void handleuserInput(){
        int choice = input.nextInt();
        switch(choice){
            case 1:
               addTask();
                break;
            case 2:
                removeTask();
                break;
            case 3:
                taskManager.listTasks();
                break;
            case 4:
                filterTask();
                break;
            case 5:
                System.out.println("Goodbye");
                System.exit(0);
            default:
                System.out.println("Invalid Choice. Please try again");
        }

        }

    private void addTask() {
        System.out.println("Enter task name:");
        String name = input.next();
        System.out.println("Enter task priority (HIGH, MEDIUM, LOW):");
        Priority priority = Priority.valueOf(input.next().toUpperCase());
        Task newTask = new Task(name, priority);
        taskManager.addTask(newTask);
        System.out.println("Task added.");
    }

    private void removeTask() {
        System.out.print("Enter task name to remove: ");
        String name = input.next();
        taskManager.removetask(name);
        System.out.println("Task removed.");
    }

    private void filterTask(){
        System.out.println("Enter priority to filter (HIGH, MEDIUM, LOW): ");
        try {
            Priority priority = Priority.valueOf(input.next().toUpperCase());
            taskManager.filterByPriority(priority);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

}


