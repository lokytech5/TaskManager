import java.util.Date;

public class Task {
    private String name;
    private Priority priority;
    private Date localDate;

    @Override
    public String toString() {
        return "Task Name" + getName() + " " +
                "Priority Name " + getPriority() + " " +
                "local Date" + getLocalDate();
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
