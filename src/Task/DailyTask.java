package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task {


    public DailyTask(String title,String description, LocalDateTime dateTime, Type type ) {
        super(title,description,dateTime, type );

    }

    @Override
    public TaskTypeDay getTaskTypeDay() {
        return TaskTypeDay.DAILY;
    }


    @Override
    public boolean appearsIn(LocalDate localDate) {
        LocalDate taskDate = this.getDateTime().toLocalDate();
        return localDate.equals(taskDate) || localDate.isAfter(taskDate);
    }
}
