import java.util.Date;

public class Task {
    private String name;
    private Priority priority;
    private Date localDate;

    public Task(String name, Priority priority, Date localDate) {
        this.name = name;
        this.priority = priority;
        this.localDate = localDate;
    }

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task: " + getName() + " " +
                "Priority: " + getPriority() + " " +
                "local-Date: " + getLocalDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }
}
