package Task;

public enum TaskTypeDay {
    ONETIME("ONETIME"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    YEARLY("YEARLY");
    private final String taskTypeDay;

    TaskTypeDay(String taskTypeDay) {
        this.taskTypeDay = taskTypeDay;
    }

    public String getTaskTypeDay() {
        return taskTypeDay;
    }
}

