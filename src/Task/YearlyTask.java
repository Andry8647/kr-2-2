package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {

    public YearlyTask(String title, Type type, String description, LocalDateTime dateTime) {
        super(title, type, description,dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.getDayOfYear() == getDateTime().toLocalDate().getDayOfYear();
    }
}
